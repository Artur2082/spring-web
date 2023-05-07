package com.hillel.springweb.root;

import com.hillel.springweb.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> create(Product product){
        this.productRepository.addProduct(product);
        return productRepository.getProductList();
    }

    public List<Product> findAll(){
        return this.productRepository.getAll();
    }
}
