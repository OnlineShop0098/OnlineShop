package com.example.OnlineShop.ProductController;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public void createProduct(CreateProductRequestDTO requestDTO) {
        ProductEntity productEntity = productMapper.toProductEntity(requestDTO);
        productRepository.save(productEntity);
    }
}
