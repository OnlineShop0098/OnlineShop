package com.example.OnlineShop.Product;

import com.example.OnlineShop.utils.ApiResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @Operation(summary = "this api allow you to get product", description = "get all product by just call to this api")
    @GetMapping
    public ApiResponse<List<ListProductResponseDTO>> getListProduct(){
        List<ListProductResponseDTO> listProduct = productService.getListProduct();
        return new ApiResponse<>(true, "Success",listProduct);
    }
}
