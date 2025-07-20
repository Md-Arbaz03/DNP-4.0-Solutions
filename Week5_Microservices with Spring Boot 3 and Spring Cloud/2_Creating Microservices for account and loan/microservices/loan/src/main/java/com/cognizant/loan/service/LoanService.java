package com.cognizant.loan.service;

import com.cognizant.loan.model.LoanAccounts;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
    public LoanAccounts getLoanAccountDetails(String number) {
        return new LoanAccounts(number, "car",400000, 3258, 18);
    }
}
