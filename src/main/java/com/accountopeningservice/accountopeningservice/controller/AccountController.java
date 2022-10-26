package com.accountopeningservice.accountopeningservice.controller;

import com.accountopeningservice.accountopeningservice.model.Account;
import com.accountopeningservice.accountopeningservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("new")
    public ResponseEntity<Account> createAccount(@Valid @RequestBody Account account){
        Account saveAccount=accountService.createAccount(account);
        return new ResponseEntity<Account>(saveAccount, HttpStatus.CREATED);

    }
}
