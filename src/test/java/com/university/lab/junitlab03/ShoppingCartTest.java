package com.university.lab.junitlab03;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    @Test
    public void testAddItems() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        cart.addItem("Banana");
        cart.addItem("Orange");
        assertEquals(3, cart.getItemCount());
    }

    @Test
    public void testRemoveItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        cart.addItem("Banana");
        cart.addItem("Orange");
        cart.removeItem("Banana");
        assertEquals(2, cart.getItemCount());
    }

    @Test
    public void testClearCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        cart.addItem("Banana");
        cart.clear();
        assertEquals(0, cart.getItemCount());
    }

    @Test
    public void testRemoveNonExistentItem() {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        assertDoesNotThrow(() -> cart.removeItem("Grapes"));
        assertEquals(1, cart.getItemCount());
    }
}