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

    public Product create(Product product){
        return this.productRepository.createProd(product);
    }

    public List<Product> findAll(){
        return this.productRepository.getAll();
    }
}
