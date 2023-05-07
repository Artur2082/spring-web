package com.hillel.springweb.root;

import com.hillel.springweb.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order create(Order order){
        this.orderRepository.addOrder(order);
        return order;
    }

    public Order findById (Integer id){
        return this.orderRepository.getById(id);
    }
public List<Order> findALL(){
        return this.orderRepository.getAll();
}
}
