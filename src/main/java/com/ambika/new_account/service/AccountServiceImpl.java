package com.ambika.new_account.service;

import com.ambika.new_account.model.Account;
import com.ambika.new_account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    public AccountRepository accountRepository;

    @Override
    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }


    @Override
    public void addAccount(Account account) {
        accountRepository.save(account);
    }

    @Override
    public Account getAccountById(Integer id) {
        Optional<Account> optional = accountRepository.findById(id);
        Account account = null;
        if (optional.isPresent()){
            account = optional.get();
        }else {
            throw new RuntimeException("Account not found for id :: " + id);
        }
        return account;
    }

    @Override
    public void updateAccount(Account account) {
        accountRepository.save(account);

    }

    @Override
    public void deleteAccountById(Integer id) {
        accountRepository.deleteById(id);
    }
}
