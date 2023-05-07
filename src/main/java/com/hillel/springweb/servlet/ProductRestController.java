package com.hillel.springweb.servlet;

import com.hillel.springweb.Order;
import com.hillel.springweb.Product;
import com.hillel.springweb.root.ProductService;
import com.hillel.springweb.servlet.mapper.ProductMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRestController {
    private final ProductMapper productMapper;
    private final ProductService productService;

    public ProductRestController(ProductMapper productMapper, ProductService productService) {
        this.productMapper = productMapper;
        this.productService = productService;
    }

    // http://localhost:8080/products
    @GetMapping
    public List<Product> getALL() {
        return productService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody Product product) {
        productMapper.map(product);
        productService.create(product);
    }
}
