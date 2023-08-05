package com.github.supercoding.web.dto.items;

import com.github.supercoding.web.dto.Spec;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
public class Item {
    private String id;
    private String name;
    private String type;
    private Integer price;
    private Spec spec;
}