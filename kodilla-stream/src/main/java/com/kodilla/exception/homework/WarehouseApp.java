package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        // Dodanie kilku zamówień
        warehouse.addOrder(new Order("A123"));
        warehouse.addOrder(new Order("B456"));
        warehouse.addOrder(new Order("C789"));

        try {
            // Próba wyszukania zamówienia, które istnieje
            Order order = warehouse.getOrder("B456");
            System.out.println("Found order: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            // Próba wyszukania zamówienia, które nie istnieje
            Order order = warehouse.getOrder("X999");
            System.out.println("Found order: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

