package com.rnr.kata.wallet.domain.entity;

import com.rnr.kata.wallet.domain.port.RateProviderPort;
import com.rnr.kata.wallet.infrastructure.RateProviderTestAdapter;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WalletTest {
    @Test
    void should_return_value_of_wallet_in_specify_currency() {
        RateProviderPort rateProviderTestAdapter = new RateProviderTestAdapter(10d);
        Value value = new Wallet(new Stock(5, StockType.PETROLEUM)).value(Currency.EUR, rateProviderTestAdapter);
        assertThat(value.getQuantity()).isEqualTo(10d);
    }
}
