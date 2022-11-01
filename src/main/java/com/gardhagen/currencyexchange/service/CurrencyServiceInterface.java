package com.gardhagen.currencyexchange.service;

import com.gardhagen.currencyexchange.model.Currency;

import java.util.List;

public interface CurrencyServiceInterface {
    Currency addCurrency(Currency currency);
    List<Currency> getAllCurrencies();
    Currency getCurrencyById(long id);
    Currency updateCurrency(Currency currency,long id);
    void deleteCurrency(long id);
}
