package com.hillel.springweb.servlet.mapper;

import com.hillel.springweb.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public Product map(Product product){
       return new Product(product.getId(), product.getName(), product.getCost());
    }
}
