package com.example.edstruments.Controller;

import com.example.edstruments.Entities.Product;
import com.example.edstruments.Service.IProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    IProductService productService;

    @GetMapping()
    public ResponseEntity<?>getAllProducts(){
        return ResponseEntity.ok(productService.getListOfProducts());
    }
    @GetMapping("/{id}")
    public ResponseEntity<?>getProductById(@PathVariable Long id){
        return ResponseEntity.ok(productService.getProductById(id));
    }

    @PostMapping()
    public ResponseEntity<?>saveProduct(@Valid @RequestBody Product  product){
        return ResponseEntity.ok(productService.addProduct(product));

    }

    @PutMapping("/{id}")
    public ResponseEntity<?>updateProduct(@PathVariable Long id,@Valid @RequestBody Product product){
        return ResponseEntity.ok(productService.updateProduct(id,product));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?>deleteProduct(@PathVariable Long id){
        return ResponseEntity.ok(productService.deleteProduct(id));
    }
}
