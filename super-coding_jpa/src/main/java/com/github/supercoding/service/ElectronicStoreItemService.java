package com.github.supercoding.service;

import com.github.supercoding.repository.items.ElectronicStoreItemJpaRepository;
import com.github.supercoding.repository.items.ElectronicStoreItemRepository;
import com.github.supercoding.repository.items.ItemEntity;
import com.github.supercoding.repository.storeSales.StoreSales;
import com.github.supercoding.repository.storeSales.StoreSalesJpaRepository;
import com.github.supercoding.repository.storeSales.StoreSalesRepository;
import com.github.supercoding.service.exceptions.NotFoundException;
import com.github.supercoding.service.mapper.ItemMapper;
import com.github.supercoding.web.dto.items.BuyOrder;
import com.github.supercoding.web.dto.items.Item;
import com.github.supercoding.web.dto.items.ItemBody;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class ElectronicStoreItemService {
    private final ElectronicStoreItemRepository electronicStoreItemRepository;
    private final ElectronicStoreItemJpaRepository electronicStoreItemJpaRepository;

    private final StoreSalesRepository storeSalesRepository;
    private final StoreSalesJpaRepository storeSalesJpaRepository;

    public List<Item> findAllItem() {
        List<ItemEntity> itemEntities = electronicStoreItemJpaRepository.findAll();
        if (itemEntities.isEmpty()) throw new NotFoundException("아무 Items 들을 찾을 수 없습니다.");
        return itemEntities.stream().map(ItemMapper.INSTANCE::itemEntityToItem).collect(Collectors.toList());
    }

    public Integer savaItem(ItemBody itemBody) {
        ItemEntity itemEntity = ItemMapper.INSTANCE.idAndItemBodyToItemEntity(null, itemBody);
        ItemEntity itemEntityCreated;
        try {
            itemEntityCreated = electronicStoreItemJpaRepository.save(itemEntity);
        } catch (RuntimeException exception) {
            throw new NotFoundException("Item을 저장하는 도중에 Error 가 발생하였습니다.");
        }
        return itemEntityCreated.getId();
    }

    public Item findItemById(String id) {
        Integer idInt = Integer.parseInt(id);
        ItemEntity itemEntity = electronicStoreItemJpaRepository.findById(idInt).orElseThrow(() -> new NotFoundException("해당 Id" + idInt + "의 Item을 찾을 수 없습니다."));
        Item item = ItemMapper.INSTANCE.itemEntityToItem(itemEntity);
        return item;
    }

    public List<Item> findItemsByIds(List<String> ids) {
        List<ItemEntity> itemEntities = electronicStoreItemJpaRepository.findAll();
        return itemEntities.stream()
                .map(ItemMapper.INSTANCE::itemEntityToItem)
                .filter((item -> ids.contains(item.getId())))
                .collect(Collectors.toList());
    }

    public void deleteItem(String id) {
        Integer idInt = Integer.parseInt(id);
        electronicStoreItemJpaRepository.deleteById(idInt);
    }

    @Transactional(transactionManager = "tmJpa1")
    public Item updateItem(String id, ItemBody itemBody) {

        Integer idInt = Integer.valueOf(id);
        ItemEntity itemEntity = ItemMapper.INSTANCE.idAndItemBodyToItemEntity(null, itemBody);
        ItemEntity itemEntityUpdated = electronicStoreItemJpaRepository.findById(idInt).orElseThrow(() -> new NotFoundException("해당 Id" + idInt + "의 Item을 찾을 수 없습니다."));

        itemEntityUpdated.setItemBody(itemBody);

        return ItemMapper.INSTANCE.itemEntityToItem(itemEntityUpdated);
    }

    @Transactional(transactionManager = "tmJpa1")
    public Integer buyItems(BuyOrder buyOrder) {
        // 1. BuyOrder 에서 상품 ID와 수량을 얻어낸다.
        // 2. 상품을 조회하여 수량이 얼마나 있는 지 확인한다.
        // 3. 상품의 수량과 가격을 가지고 계산하여 총 가격을 구한다.
        // 4. 상품의 재고에 기존 계산한 재고를 구매하는 수량을 뺸다.
        // 5. 상품 구매하는 수량 * 가격 만큼 가계 매상으로 올린다.
        // (단, 재고가 아예 없거나 매장을 찾을 수 없으면 살 수 없다. )

        Integer itemId = buyOrder.getItemId();
        Integer itemNums = buyOrder.getItemNums();

        ItemEntity itemEntity = electronicStoreItemJpaRepository.findById(itemId).orElseThrow(() -> new NotFoundException("해당 Id" + itemId + "의 Item을 찾을 수 없습니다."));

        if (itemEntity.getStoreSales().isEmpty()) throw new RuntimeException("매장을 찾을 수 없습니다.");
        if (itemEntity.getStock() <= 0) throw new RuntimeException("상품의 재고가 없습니다.");

        Integer successBuyItemNums;
        if (itemNums >= itemEntity.getStock()) successBuyItemNums = itemEntity.getStock();
        else successBuyItemNums = itemNums;

        Integer totalPrice = successBuyItemNums * itemEntity.getPrice();

        // Item 재고 감소
        itemEntity.setStock(itemEntity.getStock() - successBuyItemNums);

        if (successBuyItemNums == 4) throw new RuntimeException("4개를 구매하는건 허락하지않습니다.");

        // 매장 매상 추가
        StoreSales storeSales = itemEntity.getStoreSales()
                .orElseThrow(() -> new NotFoundException("해당 Store 해당하는 StoreSale 찾을 수 없습니다."));
        storeSales.setAmount(storeSales.getAmount() + totalPrice);

        return successBuyItemNums;
    }

    public List<Item> findItemsByTypes(List<String> types) {
        List<ItemEntity> itemEntities = electronicStoreItemJpaRepository.findItemEntitiesByTypeIn(types);
        return itemEntities.stream().map(ItemMapper.INSTANCE::itemEntityToItem).collect(Collectors.toList());

    }

    public List<Item> findItemsOrderByPrices(Integer maxValue) {
        List<ItemEntity> itemEntities = electronicStoreItemJpaRepository.findItemEntitiesByPriceLessThanEqualOrderByPriceAsc(maxValue);
        return itemEntities.stream().map(ItemMapper.INSTANCE::itemEntityToItem).collect(Collectors.toList());

    }

    public Page<Item> findAllWithPageable(Pageable pageable) {
        Page<ItemEntity> itemEntities = electronicStoreItemJpaRepository.findAll(pageable);
        return itemEntities.map(ItemMapper.INSTANCE::itemEntityToItem);

    }

    public Page<Item> findAllWithPageable(List<String> type, Pageable pageable) {
        Page<ItemEntity> itemEntities = electronicStoreItemJpaRepository.findAllByTypeIn(type, pageable);
        return itemEntities.map(ItemMapper.INSTANCE::itemEntityToItem);
    }
}