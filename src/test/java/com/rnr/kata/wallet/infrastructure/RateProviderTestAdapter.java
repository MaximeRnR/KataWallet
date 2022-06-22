package com.rnr.kata.wallet.infrastructure;

import com.rnr.kata.wallet.domain.entity.Currency;
import com.rnr.kata.wallet.domain.entity.StockType;
import com.rnr.kata.wallet.domain.port.RateProviderPort;

public class RateProviderTestAdapter implements RateProviderPort {

    private Double valueToReturn;

    public RateProviderTestAdapter(Double valueToReturn) {
        this.valueToReturn = valueToReturn;
    }

    @Override
    public Double rate(StockType from, Currency to) {
        return valueToReturn;
    }
}
