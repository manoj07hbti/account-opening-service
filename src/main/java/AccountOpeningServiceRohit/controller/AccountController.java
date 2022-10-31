package AccountOpeningServiceRohit.controller;

import AccountOpeningServiceRohit.model.Account;
import AccountOpeningServiceRohit.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    private AccountService accountService;

    @PostMapping("new")
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        Account saveAccount = accountService.createAccount(account);
        return new ResponseEntity<Account>(saveAccount, HttpStatus.CREATED);
    }
    //Getter Method
    @GetMapping("/accounts")
    public List<Account> getAccountList(){

        return accountService.getAllAccount();
    }
    //Put Method
    @PutMapping("/update_account/{account_no}/{name}")
    public String updateAccount(@PathVariable long account_no,@PathVariable String name){

        return   accountService.updateAccount(account_no,name);
    }
    //Delete Method
    @DeleteMapping("/delete_account/{account_no}")
    public String deleteAccount(@PathVariable long account_no){

        return accountService.deleteAccount(account_no);
    }
}
