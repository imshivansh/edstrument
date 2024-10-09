package com.example.edstruments.Repository;

import com.example.edstruments.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product,Long> {
}
