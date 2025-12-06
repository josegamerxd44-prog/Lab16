package com.ejemplo.model;

public class CartItem {
    private final Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        if (quantity <= 0) throw new IllegalArgumentException("Cantidad inválida");
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int q) {
        if (q <= 0) throw new IllegalArgumentException("Cantidad inválida");
        this.quantity = q;
    }

    public double getSubtotal() {
        return product.getPrice() * quantity;
    }
}
