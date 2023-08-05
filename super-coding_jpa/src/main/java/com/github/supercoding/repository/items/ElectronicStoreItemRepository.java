package com.github.supercoding.repository.items;


import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElectronicStoreItemRepository {

    List<ItemEntity> findAllItems();

    Integer saveItem(ItemEntity itemEntity);

    ItemEntity updateItemEntity(Integer idInt, ItemEntity itemEntity);

    void deleteItem(int parseInt);

    ItemEntity findItemById(Integer idInt);
    void updateItemStock(Integer itemId, Integer i);
}