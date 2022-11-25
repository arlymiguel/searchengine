package com.squaretrade.dto;

import com.squaretrade.entity.CategoryProduct;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class KeyWordDto {

    private Long id;

    private String keyword;

    private CategoryProduct keywords;

}
