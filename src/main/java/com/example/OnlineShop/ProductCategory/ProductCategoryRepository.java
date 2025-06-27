package com.example.OnlineShop.ProductCategory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductCategoryRepository extends JpaRepository<ProductCategoryEntity,Long> {

    Optional<ProductCategoryEntity> findByName(String name);
}