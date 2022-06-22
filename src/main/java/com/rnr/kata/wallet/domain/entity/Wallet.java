package com.rnr.kata.wallet.domain.entity;

import com.rnr.kata.wallet.domain.port.RateProviderPort;

import java.util.Collections;
import java.util.List;

public class Wallet {
    private final List<Stock> stocks;

    public Wallet(List<Stock> stocks) {
        this.stocks = stocks;
    }

    public Wallet(Stock stock) {
       this(Collections.singletonList(stock));
    }

    public Value value(Currency currency, RateProviderPort rateProviderPort){
        return stocks.stream()
                .reduce(new Value(0d),
                        (acc, current) -> new Value(rateProviderPort.rate(current.getStockType(), currency)),
                        Value::add);
    }
}
