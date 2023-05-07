package com.hillel.springweb.root;

import com.hillel.springweb.Order;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
@Repository
public class OrderRepository {
    private List<Order> orderList;

    public OrderRepository() {
        this.orderList = new ArrayList<>();
    }
    public Order getById(int id) {
        Order ord = null;
        for (Order order : orderList) {
            if (id == order.getIdOrder()) {
                ord = order;
            }
        }
        return ord;
    }
    public List<Order> addOrder(Order order){
        orderList.add(order);
        return orderList;
    }
    public List<Order> getAll() {
        return orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }
}
