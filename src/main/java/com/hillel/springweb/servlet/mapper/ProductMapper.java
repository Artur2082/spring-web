package com.hillel.springweb.servlet.mapper;

import com.hillel.springweb.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public void map(Product product){
        new Product(product.getId(), product.getName(), product.getCost());
    }
}
