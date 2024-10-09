package com.example.edstruments.Service;

import com.example.edstruments.Dao.ProductDao;
import com.example.edstruments.Entities.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService{

    private final ProductDao productDao;
    @Override
    public List<Product> getListOfProducts() {
        return productDao.getListOfProducts();
    }

    @Override
    public Product getProductById(Long productId) {
        return productDao.getProduct(productId);
    }

    @Override
    public Product updateProduct(Long productId,Product product) {
        return productDao.updateProduct(productId,product);
    }

    @Override
    public String deleteProduct(Long productId) {
        return productDao.deleteProduct(productId);
    }

    @Override
    public Product addProduct(Product product) {
        return productDao.saveProduct(product);
    }
}
