package com.squaretrade.repository;


import com.squaretrade.entity.CategoryProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryProduct, Long> {

    List<CategoryProduct> findByParentCategory(Long parentCategory);


}
