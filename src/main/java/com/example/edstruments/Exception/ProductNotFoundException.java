package com.example.edstruments.Exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class ProductNotFoundException extends RuntimeException {

    private Long id;

    public ProductNotFoundException(Long id, String message) {
        super(message);  // Call the RuntimeException constructor with the message
        this.id = id;
    }
}

