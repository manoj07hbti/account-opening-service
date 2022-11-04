package com.ambika.new_account.service;

import com.ambika.new_account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountService {

    List<Account> getAllAccount();

    void addAccount(Account account);

    Account getAccountById(Integer id);

    void updateAccount(Account account);

    void deleteAccountById(Integer id);


}
