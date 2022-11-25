package com.squaretrade.service.impl;

import com.squaretrade.entity.CategoryProduct;
import com.squaretrade.entity.KeyWord;
import com.squaretrade.repository.CategoryRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CategoryProductServiceImplTest {

    @Mock
    private CategoryRepository categoryRepository;

    @InjectMocks
    private CategoryServiceImpl categoryServiceImpl;

    @DisplayName("When requested keywords by category id, it returns all keywords available in db")
    @Test()
    void getKeywordByCategory() {

        //given
        Long categoryId = 2L;
        List<KeyWord> keywords = new ArrayList<>();
        keywords.add(KeyWord.builder().id(1L).keyword("Furniture").build());

        CategoryProduct category = CategoryProduct.builder()
                .id(2L)
                .categoryName("Furniture")
                .keywords( keywords)
                .build();
        Optional<CategoryProduct> keywordsFound = Optional.of(category);

        when(categoryRepository.findById(categoryId)).thenReturn(keywordsFound);

        //when
        keywords = categoryServiceImpl.getKeywordsByCategory(categoryId);

        //then
        Assertions.assertNotNull(keywords);
    }

    @DisplayName("When requested category lvl, it returns all category lvl from parent available in db")
    @Test()
    void getLvlByCategory() {

        //given
        Long categoryId = 2L;
        List<KeyWord> keywords = new ArrayList<>();
        keywords.add(KeyWord.builder().id(1L).keyword("Furniture").build());

        CategoryProduct category = CategoryProduct.builder()
                .id(2L)
                .categoryName("Furniture")
                .keywords( keywords)
                .build();

        List<CategoryProduct> categoryList = new ArrayList<>();
        categoryList.add(category);

        when(categoryRepository.findByParentCategory(categoryId)).thenReturn(categoryList);

        //when
        categoryList = categoryServiceImpl.getLvlByCategory(categoryId);

        //then
        Assertions.assertNotNull(categoryList);

    }
}
