package com.hillel.springweb.root;

import com.hillel.springweb.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> productList;

    public ProductRepository() {
        this.productList = new ArrayList<>();
    }

    public List<Product> getAll(){
        return productList;
    }

public List<Product> addProduct(Product product){
        productList.add(product);
        return productList;
}
}
