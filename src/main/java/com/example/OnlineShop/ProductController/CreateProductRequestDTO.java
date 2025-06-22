package com.example.OnlineShop.ProductController;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

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
