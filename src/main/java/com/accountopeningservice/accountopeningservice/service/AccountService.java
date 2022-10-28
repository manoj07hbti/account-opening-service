package com.accountopeningservice.accountopeningservice.service;

import com.accountopeningservice.accountopeningservice.model.Account;
import com.accountopeningservice.accountopeningservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    //Put method Service Logic
    public String updateAccount(long account_no, String name) {


        Account account = accountRepository.getReferenceById(account_no);

            account.setName(name);

            accountRepository.save(account);

            return "Successfully updated name as " + name;
        }
        //Delete method Service Logic
        public String deleteAccount(long account_no){

            accountRepository.deleteById(account_no);
            return "Successfully deleted data from DB";
        }
    }
