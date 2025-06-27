package com.example.OnlineShop.Product;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class CreateProductRequestDTO {

    @NotBlank
    private String name;
    private String description;

    @NotBlank
    private BigDecimal price;

    @NotBlank
    private Integer quantity;

    @NotBlank
    private String category;

    @NotBlank
    private String brand;

    @NotBlank
    private String model;

    @NotBlank
    private String imgUrl;
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String resolution;
}
