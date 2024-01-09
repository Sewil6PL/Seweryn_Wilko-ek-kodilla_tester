package com.kodilla.spring.basic.spring_dependency_injection.homework2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ShippingCenterTest {
    @Test
    public void shouldReturnSuccessMessageWhenWeightIsLessThan30() {
        DeliveryService deliveryService = mock(DeliveryService.class);
        NotificationService notificationService = mock(NotificationService.class);
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);

        when(deliveryService.deliverPackage(anyString(), anyDouble())).thenReturn(true);
        when(notificationService.success(anyString())).thenReturn("Package delivered to: Test Address");

        String result = shippingCenter.sendPackage("Test Address", 25);
        assertEquals("Package delivered to: Test Address", result);
    }

    @Test
    public void shouldReturnFailureMessageWhenWeightIsMoreThan30() {
        DeliveryService deliveryService = mock(DeliveryService.class);
        NotificationService notificationService = mock(NotificationService.class);
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);

        when(deliveryService.deliverPackage(anyString(), anyDouble())).thenReturn(false);
        when(notificationService.fail(anyString())).thenReturn("Package not delivered to: Test Address");

        String result = shippingCenter.sendPackage("Test Address", 31);
        assertEquals("Package not delivered to: Test Address", result);
    }

}