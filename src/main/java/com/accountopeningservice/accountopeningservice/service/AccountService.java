package com.accountopeningservice.accountopeningservice.service;

import com.accountopeningservice.accountopeningservice.model.Account;
import com.accountopeningservice.accountopeningservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    //Adder method Service Logic
    public Account createAccount(Account account) {

        return accountRepository.save(account);
    }
    //Getter Method Service Logic
    public List<Account> getAllAccount() {

        return accountRepository.findAll();
    }
    //Put/Update method Service Logic
    public String updateAccount(long account_no, String name) {


        Account account = accountRepository.getReferenceById(account_no);

            account.setName(name);

            accountRepository.save(account);

            return "Successfully updated name as " + name;
        }
    //Put/Update method service logic via JSON object

  /*  public String updateAccount(Account account) {
        Account account1 = accountRepository.getReferenceById(accountRepository.count());

        accountRepository.save(account1);

        return "Successfully updated data of the selected Account Number" ;
    }*/



        //Delete method Service Logic
        public String deleteAccount(long account_no){

            accountRepository.deleteById(account_no);
            return "Successfully deleted selected Account Number data from Database";
        }

    }

