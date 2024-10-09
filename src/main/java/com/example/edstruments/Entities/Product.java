package com.example.edstruments.Entities;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    @NotNull(message = "Product name can't be null")
    @NotEmpty(message = "Product name can't be empty")
    private String productName;
    @NotNull(message = "Product description can't be null")
    @NotEmpty(message = "Product description can't be empty")
    private String productDescription;
    @NotNull(message = "product price can't be null")
    @Positive(message = "price can not be negative")
    private Long productPrice;


}
