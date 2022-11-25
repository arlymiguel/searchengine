package com.squaretrade.service.impl;

import com.squaretrade.dto.CategoryProductDto;
import com.squaretrade.dto.KeyWordDto;
import com.squaretrade.entity.CategoryProduct;
import com.squaretrade.entity.KeyWord;
import com.squaretrade.mapper.CategoryProductMapperI;
import com.squaretrade.mapper.KeywordMapperI;
import com.squaretrade.repository.CategoryRepository;
import com.squaretrade.service.CategoryServiceI;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CategoryServiceImpl implements CategoryServiceI {

    private final CategoryRepository categoryRepository;

    @Override
    public List<KeyWordDto> getKeywordsByCategory(Long id) {

        Optional<CategoryProduct> list = categoryRepository.findById(id);

        if (list.isPresent()) {
            return KeywordMapperI.INSTANCE.toKeyWordDtoList(list.get().getKeywords().stream().toList());
        } else {
            return null;
        }

    }

    @Override
    public List<CategoryProductDto> getLvlByCategory(Long id) {

        return CategoryProductMapperI.INSTANCE.toCategoryProductDtoList(categoryRepository.findByParentCategory(id));
    }

}
