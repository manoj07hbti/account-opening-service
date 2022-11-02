package com.areena.new_account.service;

import com.areena.new_account.model.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAllAccount();

    void addAccount(Account account);

    Account getAccountById(Integer id);

    void updateAccount(Account account);

    void deleteAccountById(Integer id);


}
