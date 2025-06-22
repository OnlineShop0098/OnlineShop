package com.example.OnlineShop.ProductController;

import com.example.OnlineShop.utils.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    @Operation(summary = "this api is to create product" , description = "write product detail in request body and the product will be created")
    @PostMapping
    public ApiResponse<CreateProductRequestDTO> createProduct(@RequestBody CreateProductRequestDTO requestDTO){
        productService.createProduct(requestDTO);
        return new ApiResponse<>(true,"Success", requestDTO);
    }
}
