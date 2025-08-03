package com.cognizant.account.controller;

import com.cognizant.account.model.Account;
import com.cognizant.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/{number}")
    public Account accountDetails(@PathVariable String number) {
        return accountService.getDetails(number);
    }
}
