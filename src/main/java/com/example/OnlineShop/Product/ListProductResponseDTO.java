package com.example.OnlineShop.Product;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ListProductResponseDTO {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Integer quantity;
    private String category;
    private String brand;
    private String model;
    private String imgUrl;
    private String cpu;
    private String ram;
    private String storage;
    private String gpu;
    private String resolution;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
