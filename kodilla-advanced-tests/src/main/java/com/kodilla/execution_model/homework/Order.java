package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private double orderValue;
    private LocalDate orderDate;
    private String customerLogin;

    public Order(double orderValue, LocalDate orderDate, String customerLogin) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.customerLogin = customerLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getCustomerLogin() {
        return customerLogin;
    }
}
