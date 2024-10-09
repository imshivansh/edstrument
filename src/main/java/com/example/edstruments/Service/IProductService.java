package com.example.edstruments.Service;

import com.example.edstruments.Entities.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IProductService {
    public List<Product> getListOfProducts();
    public Product getProductById(Long productId);
    public Product updateProduct(Long productId,Product product);
    public String deleteProduct(Long productId);
    public Product addProduct(Product product);

}
