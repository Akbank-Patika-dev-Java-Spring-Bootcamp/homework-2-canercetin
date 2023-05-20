package com.example.bootcampdemo2.mapper;

import com.example.bootcampdemo2.dto.ProductDTO;
import com.example.bootcampdemo2.dto.ProductSaveRequest;
import com.example.bootcampdemo2.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    Product saveRequestToProduct(ProductSaveRequest productSaveRequest);
    ProductDTO productToProductDto(Product product);
    List<ProductDTO> productListToProductDtoList(List<Product> products);
}
