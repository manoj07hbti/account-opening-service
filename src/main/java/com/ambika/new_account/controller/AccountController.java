package com.ambika.new_account.controller;

import com.ambika.new_account.model.Account;
import com.ambika.new_account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    // List Of Accounts
    @GetMapping(path ="/accounts")
    public List<Account> getAll(){
        return accountService.getAllAccount();
    }

    // Get specific account
    @GetMapping(path = "accounts/{id}")
    public Account getAccountById(@PathVariable(name = "id") Integer id){
        return accountService.getAccountById(id);
    }

    //Delete Account
    @DeleteMapping(path = "accounts/{id}")
    public void deleteAccount(@PathVariable(value = "id") Integer id){
        accountService.deleteAccountById(id);
    }

    //Add new Account
    @PostMapping(path = "/accounts")
    public void addAccount(@RequestBody Account account){
        accountService.addAccount(account);
    }

    @PutMapping(path = "accounts/{id}")
    public void updateAccount( @Valid @RequestBody Account account,@PathVariable(value ="id") Integer id){
        Account accountById = accountService.getAccountById(id);
        accountById.setName(account.getName());
        accountById.setPhone(account.getPhone());
        accountById.setPanNumber(account.getPanNumber());

        accountService.addAccount(accountById);
    }
}
