package com.cognizant.loan.controller;

import com.cognizant.loan.model.LoanAccounts;
import com.cognizant.loan.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping("/{number}")
    public LoanAccounts getLoanAccountsDetails(@PathVariable String number) {
        return loanService.getLoanAccountDetails(number);
    }
}
