package com.ejemplo.model;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class ShoppingCart {

    private final Map<String, CartItem> items = new LinkedHashMap<>();

    public void addProduct(Product product, int quantity) {
        if (quantity <= 0) throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        CartItem existing = items.get(product.getId());
        if (existing != null) existing.setQuantity(existing.getQuantity() + quantity);
        else items.put(product.getId(), new CartItem(product, quantity));
    }

    public void removeProduct(String productId) {
        if (!items.containsKey(productId)) throw new IllegalArgumentException("El producto no está en el carrito");
        items.remove(productId);
    }

    public void updateQuantity(String productId, int newQuantity) {
        if (newQuantity <= 0) throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        CartItem existing = items.get(productId);
        if (existing == null) throw new IllegalArgumentException("El producto no está en el carrito");
        existing.setQuantity(newQuantity);
    }

    public void clear() {
        items.clear();
    }

    public Collection<CartItem> getItems() {
        return items.values();
    }

    public int getTotalItems() {
        return items.values().stream().mapToInt(CartItem::getQuantity).sum();
    }

    public double getTotalAmount() {
        return items.values().stream().mapToDouble(CartItem::getSubtotal).sum();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
