package com.hillel.springweb.servlet.mapper;

import com.hillel.springweb.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderMapper {
    public Order map(Order order) {
        return  new Order(order.getIdOrder(),order.getDate(), order.getCost(),order.getProducts());
    }
}
