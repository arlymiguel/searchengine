package com.squaretrade.mapper;

import com.squaretrade.dto.CategoryProductDto;
import com.squaretrade.entity.CategoryProduct;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CategoryProductMapperI {

    CategoryProductMapperI INSTANCE = Mappers.getMapper(CategoryProductMapperI.class);

    CategoryProductDto toCategoryProductDto(CategoryProduct nace);

    CategoryProduct toCategoryProduct(CategoryProductDto nace);

    List<CategoryProductDto> toCategoryProductDtoList(List<CategoryProduct> categoryProductList);

    List<CategoryProduct> toCategoryProductList(List<CategoryProductDto> categoryProductDtoList);

}
