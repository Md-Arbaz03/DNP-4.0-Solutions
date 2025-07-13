package com.cognizant.spring_learn.exception;

public class CountryNotFoundException extends RuntimeException {
    public CountryNotFoundException(String code) {
        super("Country with code '" + code + "' not found");
    }
}
