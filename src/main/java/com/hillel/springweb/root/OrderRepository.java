package com.hillel.springweb;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
    public Order addOrder(Order order){
        orderList.add(order);
        return order;
    }
    public List<Order> getAll() {
        return orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
