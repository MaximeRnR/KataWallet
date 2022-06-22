package com.rnr.kata.wallet.domain.port;

import com.rnr.kata.wallet.domain.entity.Currency;
import com.rnr.kata.wallet.domain.entity.StockType;

public interface RateProviderPort {
    Double rate(StockType from, Currency to);
}
