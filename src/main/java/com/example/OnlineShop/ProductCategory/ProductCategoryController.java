package com.example.OnlineShop.ProductCategory;

import com.example.OnlineShop.utils.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/category")
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;

    @PostMapping
    @Operation(summary = "create product category" ,description = "give category name in the request body")
    public ApiResponse<Void> createProductCategory(@RequestBody CreateProductCategoryRequestDTO requestDTO){
        productCategoryService.createCategory(requestDTO);
        return new ApiResponse<>(true,"successful", null);
    }
}
