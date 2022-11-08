package account_opening.Service.controller;

import account_opening.Service.model.Account_Details;
import account_opening.Service.service.Account_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
   private Account_Service accountService;

    @PostMapping("/addAccount")
    public ResponseEntity<Account_Details> CreatedAccount( @Valid @RequestBody Account_Details accountDetails){

       Account_Details saveAccount_Details = accountService.CreatedAccount(accountDetails);
        return new ResponseEntity<Account_Details>(saveAccount_Details, HttpStatus.CREATED);
    }

    @GetMapping("/getAllAccount")
    public List<Account_Details> getAll(){
        return accountService.getALL();
    }

    @DeleteMapping("/deleteAccount/{AccountNo}")
    public String DeleteAccount(@PathVariable long AccountNo){
      return accountService.DeleteAccount(AccountNo);
    }

    @GetMapping("/findByName/{name}")
    public Account_Details findByName(@PathVariable String name) {
        return accountService.findByName(name);
    }


}
