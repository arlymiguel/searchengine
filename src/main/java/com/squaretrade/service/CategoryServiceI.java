package com.squaretrade.service;

import com.squaretrade.dto.CategoryProductDto;
import com.squaretrade.dto.KeyWordDto;

import java.util.List;

public interface CategoryServiceI {

    List<KeyWordDto> getKeywordsByCategory(Long id);
    List<CategoryProductDto> getLvlByCategory(Long id);

}
