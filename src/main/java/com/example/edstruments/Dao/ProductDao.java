package com.example.edstruments.Dao;

import com.example.edstruments.Entities.Product;
import com.example.edstruments.Exception.NoProductExistExeption;
import com.example.edstruments.Exception.ProductNotFoundException;
import com.example.edstruments.Repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductDao {
    @Autowired
    IProductRepository productRepository;

    public List<Product> getListOfProducts() throws NoProductExistExeption {
        List<Product> products = productRepository.findAll();

        if (products.isEmpty()) {
            throw new NoProductExistExeption("There are no products in the database to display");
        }

        return products;
    }


    public Product getProduct(Long productId) throws ProductNotFoundException{
        return productRepository.findById(productId).orElseThrow(()->new ProductNotFoundException(productId,"Product not found"));
    }


    public Product updateProduct(Long id, Product product){
        Product productToBeUpdated = getProduct(id);
        productToBeUpdated.setProductDescription(product.getProductDescription());
        productToBeUpdated.setProductPrice(product.getProductPrice());
        productToBeUpdated.setProductName(product.getProductName());
        return saveProduct(productToBeUpdated);
    }

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public String deleteProduct(Long id)throws ProductNotFoundException{
            if(productRepository.existsById(id)){
                productRepository.delete(getProduct(id));
                return "Product has  been successfully deleted";
            }
            throw new ProductNotFoundException(id,"Product could not be found or Already Deleted");


    }
}
