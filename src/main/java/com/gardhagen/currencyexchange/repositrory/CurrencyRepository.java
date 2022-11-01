package com.gardhagen.currencyexchange.repositrory;

import com.gardhagen.currencyexchange.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency,Long> {
    Currency findCurrencyById(long currencyId);
}
