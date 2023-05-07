package com.hillel.springweb.root;

import com.hillel.springweb.root.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int idOrder;
    private LocalDate date;
    private double cost;
    private List<Product> products;

    public Order(int idOrder, LocalDate date) {
        this.idOrder = idOrder;
        this.date = date;
        this.cost = products.stream().mapToDouble(Product::getCost).sum();
        this.products = new ArrayList<>();
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", date=" + date +
                ", cost=" + cost +
                ", products=" + products +
                '}' + '\n';
    }
}
