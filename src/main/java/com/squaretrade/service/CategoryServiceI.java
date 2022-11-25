package com.squaretrade.service;

import com.squaretrade.entity.CategoryProduct;
import com.squaretrade.entity.KeyWord;

import java.util.List;

public interface CategoryServiceI {

    List<KeyWord> getKeywordsByCategory(Long id);
    List<CategoryProduct> getLvlByCategory(Long id);

}
