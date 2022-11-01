package com.gardhagen.currencyexchange.controller;

import com.gardhagen.currencyexchange.model.Currency;
import com.gardhagen.currencyexchange.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/currency")
public class CurrencyController {
    @Autowired
    private CurrencyService currencyService;

    @GetMapping("/")
    public List<Currency> getAllCurrencies(){return currencyService.getAllCurrencies();}
    @PostMapping("/add")
    public ResponseEntity<Currency> addCurrency(@RequestBody Currency currency){
        return new ResponseEntity<Currency>(currencyService.addCurrency(currency), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public Currency getCurrencyById(@PathVariable("id")Long id){
        return currencyService.getCurrencyById(id);
    }
}
