package com.example.bootcampdemo2.dao;

import com.example.bootcampdemo2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
