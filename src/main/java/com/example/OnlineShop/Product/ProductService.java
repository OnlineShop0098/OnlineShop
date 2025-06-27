package com.example.OnlineShop.Product;

import java.util.List;

public interface ProductService {

    void createProduct(CreateProductRequestDTO requestDTO);

    List<ListProductResponseDTO> getListProduct();
}
