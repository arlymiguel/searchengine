package com.squaretrade.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryProductDto {
    private Long id;

    private Long parentCategory;

    private String categoryName;

    private List<KeyWordDto> keywords;
}
