package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    @Test
    void shouldThrowOrderDoesntExistException() {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("A123"));
        warehouse.addOrder(new Order("B456"));
        warehouse.addOrder(new Order("C789"));

        // when
        // Próba wyszukania zamówienia, które nie istnieje
        OrderDoesntExistException thrownException = assertThrows(OrderDoesntExistException.class,
                () -> warehouse.getOrder("X999"));

        // then
        // Sprawdzenie treści komunikatu w wyjątku
        String expectedMessage = "Order with number X999 doesn't exist in the warehouse.";
        String actualMessage = thrownException.getMessage();
        assert(actualMessage.contains(expectedMessage));
    }

}