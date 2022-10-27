package accountopeningservice.accountopeningservice.controller;

import accountopeningservice.accountopeningservice.model.Account;

import accountopeningservice.accountopeningservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("new")
    public ResponseEntity<Account> createAccount(@RequestBody Account account){
        Account saveAccount=accountService.createAccount(account);
        return new ResponseEntity<Account>(saveAccount, HttpStatus.CREATED);


    }
}
