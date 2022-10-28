package com.accountopeningservice.accountopeningservice.controller;

import com.accountopeningservice.accountopeningservice.model.Account;
import com.accountopeningservice.accountopeningservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;
    //Adder method controller with validation,inserted as a JSON object

    @PostMapping("new")
    public ResponseEntity<Account> createAccount(@Valid @RequestBody Account account){
        Account saveAccount=accountService.createAccount(account);
        return new ResponseEntity<Account>(saveAccount, HttpStatus.CREATED);
    }
    //Getter Method controller
    @GetMapping("/accounts")
    public List<Account> getAccountList(){

        return accountService.getAllAccount();
    }
    //Put method Controller.
    @PutMapping("/update_account/{account_no}/{name}")
    public String updateAccount(@PathVariable long account_no,@PathVariable String name){

        return   accountService.updateAccount(account_no,name);


    }

}
