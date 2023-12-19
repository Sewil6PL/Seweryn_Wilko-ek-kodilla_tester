package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders;

    public Shop() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersInDateRange(LocalDate startDate, LocalDate endDate) {
        return orders.stream()
                .filter(order -> !order.getOrderDate().isBefore(startDate) && !order.getOrderDate().isAfter(endDate))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByOrderValueRange(double minValue, double maxValue) {
        return orders.stream()
                .filter(order -> order.getOrderValue() >= minValue && order.getOrderValue() <= maxValue)
                .collect(Collectors.toList());
    }

    public int getNumberOfOrders() {
        return orders.size();
    }

    public double getTotalOrderValue() {
        return orders.stream().mapToDouble(Order::getOrderValue).sum();
    }
}
