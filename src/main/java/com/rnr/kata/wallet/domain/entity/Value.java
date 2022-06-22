package com.rnr.kata.wallet.domain.entity;

public class Value {
    private final Double quantity;

    public Value(Double quantity) {
        this.quantity = quantity;
    }

    public Double getQuantity() {
        return quantity;
    }

    public Value add(Value other) {
        return new Value(quantity + other.quantity);
    }
}
