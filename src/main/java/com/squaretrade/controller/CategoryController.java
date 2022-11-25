package com.squaretrade.controller;

import com.squaretrade.entity.KeyWord;
import com.squaretrade.service.impl.CategoryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/search-engine")
public class CategoryController {

    private final CategoryServiceImpl categoryService;

    @GetMapping
    private List<KeyWord> getKeywordsByCategory(Long id){
        return categoryService.getKeywordsByCategory(id);
    }

}
