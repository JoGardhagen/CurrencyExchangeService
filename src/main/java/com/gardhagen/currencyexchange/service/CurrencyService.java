package com.gardhagen.currencyexchange.service;

import com.gardhagen.currencyexchange.model.Currency;
import com.gardhagen.currencyexchange.repositrory.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CurrencyService implements CurrencyServiceInterface{

    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    public Currency addCurrency(Currency currency) {
        return currencyRepository.save(currency);
    }

    @Override
    public List<Currency> getAllCurrencies() {
        return currencyRepository.findAll();
    }

    @Override
    public Currency getCurrencyById(long id) {
        return currencyRepository.findCurrencyById(id);
    }

    @Override
    public Currency updateCurrency(Currency currency, long id) {
        return null;
    }

    @Override
    public void deleteCurrency(long id) {

    }
}
