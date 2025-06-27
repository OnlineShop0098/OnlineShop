package com.example.OnlineShop.Product;

import com.example.OnlineShop.ProductCategory.ProductCategoryEntity;
import com.example.OnlineShop.ProductCategory.ProductCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final ProductCategoryRepository productCategoryRepository;

    @Override
    public void createProduct(CreateProductRequestDTO requestDTO) {

        ProductCategoryEntity category = productCategoryRepository.findByName(requestDTO.getCategory()).orElseThrow(()-> new IllegalStateException("category does not exist"));

        ProductEntity productEntity = productMapper.toProductEntity(requestDTO);
        productEntity.setCategoryEntity(category);
        productRepository.save(productEntity);
    }

    @Override
    public List<ListProductResponseDTO> getListProduct() {
        return productMapper.toListProductResponseDTO(productRepository.findAll());
    }
}
