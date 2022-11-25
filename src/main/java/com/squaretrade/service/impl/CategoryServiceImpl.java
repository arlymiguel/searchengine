package com.squaretrade.service.impl;

import com.squaretrade.entity.CategoryProduct;
import com.squaretrade.entity.KeyWord;
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
    public List<KeyWord> getKeywordsByCategory(Long id) {

        Optional<CategoryProduct> list = categoryRepository.findById(id);

        if (list.isPresent()) {
            return list.get().getKeywords().stream().toList();
        } else {
            return null;
        }

    }

    @Override
    public List<CategoryProduct> getLvlByCategory(Long id) {
        return categoryRepository.findByParentCategory(id);
    }

}
