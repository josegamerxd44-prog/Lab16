package com.ejemplo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    void CA01_agregaProducto() {
        ShoppingCart cart = new ShoppingCart();
        Product p = new Product("A", "Prod A", 10.0);
        cart.addProduct(p, 1);
        assertEquals(1, cart.getTotalItems());
        assertEquals(10.0, cart.getTotalAmount());
    }

    @Test
    void CA02_actualizaCantidad() {
        ShoppingCart cart = new ShoppingCart();
        Product p = new Product("A", "Prod A", 10.0);
        cart.addProduct(p, 1);
        cart.updateQuantity("A", 3);
        assertEquals(3, cart.getTotalItems());
        assertEquals(30.0, cart.getTotalAmount());
    }

    @Test
    void CA03_eliminaProducto() {
        ShoppingCart cart = new ShoppingCart();
        Product p = new Product("A", "Prod A", 10.0);
        cart.addProduct(p, 1);
        cart.removeProduct("A");
        assertTrue(cart.isEmpty());
        assertEquals(0, cart.getTotalItems());
        assertEquals(0.0, cart.getTotalAmount());
    }

    @Test
    void CA04_eliminarNoExistente() {
        ShoppingCart cart = new ShoppingCart();
        Exception ex = assertThrows(
                IllegalArgumentException.class,
                () -> cart.removeProduct("X")
        );
        assertTrue(ex.getMessage().contains("carrito"));
    }
}
