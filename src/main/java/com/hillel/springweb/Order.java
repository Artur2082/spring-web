package com.hillel.springweb;

import com.hillel.springweb.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private int idOrder;
    private Date date;
    private double cost;
    private List<Product> products;

    public Order(int idOrder, Date date, double cost, List<Product> products) {
        this.idOrder = idOrder;
        this.date = date;
        this.cost = cost;
        this.products = products;
    }
    public Order() {
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<Product> getProducts() {
        return products;
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
