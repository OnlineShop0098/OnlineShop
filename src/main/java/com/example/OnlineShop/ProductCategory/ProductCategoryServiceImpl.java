package com.example.OnlineShop.ProductCategory;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCategoryServiceImpl implements ProductCategoryService{

    private final ProductCategoryRepository productCategoryRepository;
    private final ProductCategoryMapper productCategoryMapper;

    @Override
    public void createCategory(CreateProductCategoryRequestDTO requestDTO) {
        ProductCategoryEntity productCategoryEntity = productCategoryMapper.toProductCategoryEntity(requestDTO);
        productCategoryRepository.save(productCategoryEntity);
    }
}
