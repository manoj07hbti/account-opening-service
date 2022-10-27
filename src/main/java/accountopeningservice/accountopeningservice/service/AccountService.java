package accountopeningservice.accountopeningservice.service;

import accountopeningservice.accountopeningservice.model.Account;
import accountopeningservice.accountopeningservice.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account){

        return accountRepository.save(account);
}
}