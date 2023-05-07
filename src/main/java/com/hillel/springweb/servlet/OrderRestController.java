package com.hillel.springweb.servlet;

import com.hillel.springweb.Order;
import com.hillel.springweb.Product;
import com.hillel.springweb.root.OrderService;
import com.hillel.springweb.root.ProductService;
import com.hillel.springweb.servlet.mapper.OrderMapper;
import com.hillel.springweb.servlet.mapper.ProductMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderRestController {

    private final OrderMapper orderMapper;
    private final OrderService orderService;

    public OrderRestController(OrderMapper orderMapper, OrderService orderService) {
        this.orderMapper = orderMapper;
        this.orderService = orderService;
    }
    @GetMapping
    public List<Order> getALL() {
        return orderService.findALL();
    }

    // http://localhost:8080/orders/1
    @GetMapping("/{id}")
    public Order getById(@PathVariable("id") Integer id) {
        return orderService.findById(id);
    }

    // http://localhost:8080/orders
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createOrder(@RequestBody Order order){
        order = orderMapper.map(order);
        orderService.create(order);
    }
}
