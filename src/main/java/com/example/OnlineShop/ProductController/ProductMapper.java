package com.example.OnlineShop.ProductController;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProductMapper {

    ProductEntity toProductEntity(CreateProductRequestDTO requestDTO);
}
