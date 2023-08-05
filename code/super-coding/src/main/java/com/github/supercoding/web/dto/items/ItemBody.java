package com.github.supercoding.web.dto.items;
import com.github.supercoding.web.dto.Spec;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ItemBody {
    private String name;
    private String type;
    private Integer price;
    private Spec spec;
}