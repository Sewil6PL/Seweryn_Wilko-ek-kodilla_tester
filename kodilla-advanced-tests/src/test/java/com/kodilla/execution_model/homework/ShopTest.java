package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    @Test
    public void shouldAddOrder() {
        // Arrange
        Shop shop = new Shop();
        Order order = new Order(100.0, LocalDate.now(), "user123");

        // Act
        shop.addOrder(order);

        // Assert
        assertEquals(1, shop.getNumberOfOrders(), "Liczba zamówień powinna wynosić 1 po dodaniu zamówienia.");
    }

    @Test
    public void shouldGetOrdersInDateRange() {
        // Arrange
        Shop shop = new Shop();
        Order order1 = new Order(100.0, LocalDate.parse("2023-01-01"), "user123");
        Order order2 = new Order(150.0, LocalDate.parse("2023-01-02"), "user456");
        shop.addOrder(order1);
        shop.addOrder(order2);

        // Act
        LocalDate startDate = LocalDate.parse("2023-01-01");
        LocalDate endDate = LocalDate.parse("2023-01-02");
        List<Order> ordersInDateRange = shop.getOrdersInDateRange(startDate, endDate);

        // Assert
        assertEquals(2, ordersInDateRange.size(), "Liczba zamówień w podanym zakresie dat powinna wynosić 2.");
    }

    @Test
    public void shouldGetOrdersByOrderValueRange() {
        // Arrange
        Shop shop = new Shop();
        Order order1 = new Order(100.0, LocalDate.parse("2023-01-01"), "user123");
        Order order2 = new Order(150.0, LocalDate.parse("2023-01-02"), "user456");
        shop.addOrder(order1);
        shop.addOrder(order2);

        // Act
        double minValue = 100.0;
        double maxValue = 120.0;
        List<Order> ordersByValueRange = shop.getOrdersByOrderValueRange(minValue, maxValue);

        // Assert
        assertEquals(1, ordersByValueRange.size(), "Liczba zamówień w podanym zakresie wartości powinna wynosić 1.");
    }

    @Test
    public void shouldGetNumberOfOrders() {
        // Arrange
        Shop shop = new Shop();
        Order order1 = new Order(100.0, LocalDate.parse("2023-01-01"), "user123");
        Order order2 = new Order(150.0, LocalDate.parse("2023-01-02"), "user456");
        shop.addOrder(order1);
        shop.addOrder(order2);

        // Act
        int numberOfOrders = shop.getNumberOfOrders();

        // Assert
        assertEquals(2, numberOfOrders, "Liczba zamówień powinna wynosić 2.");
    }

    @Test
    public void shouldGetTotalOrderValue() {
        // Arrange
        Shop shop = new Shop();
        Order order1 = new Order(100.0, LocalDate.parse("2023-01-01"), "user123");
        Order order2 = new Order(150.0, LocalDate.parse("2023-01-02"), "user456");
        shop.addOrder(order1);
        shop.addOrder(order2);

        // Act
        double totalOrderValue = shop.getTotalOrderValue();

        // Assert
        assertEquals(250.0, totalOrderValue, "Suma wartości wszystkich zamówień powinna wynosić 250.0.");
    }

}