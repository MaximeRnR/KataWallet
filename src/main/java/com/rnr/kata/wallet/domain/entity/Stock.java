package com.rnr.kata.wallet.domain.entity;

public class Stock {
    private final StockType stockType;
    private final Integer quantity;

    public Stock(StockType stockType, Integer quantity) {
        this.stockType = stockType;
        this.quantity = quantity;
    }

    public Stock(Integer quantity, StockType stockType) {
     this(stockType, quantity);
    }

    public StockType getStockType() {
        return stockType;
    }

}
