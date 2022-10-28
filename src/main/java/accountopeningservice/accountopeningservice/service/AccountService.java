package accountopeningservice.accountopeningservice.service;

import accountopeningservice.accountopeningservice.model.Account;
import accountopeningservice.accountopeningservice.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account){

        return accountRepository.save(account);
}
    //Get
    public List<Account> getAllAccount() {

        return accountRepository.findAll();
    }
    //Put
    public String updateAccount(long account_no, String name) {


        Account account = accountRepository.getReferenceById(account_no);

        account.setName(name);

        accountRepository.save(account);

        return "Successfully updated name as " + name;
    }
    //Delete
    public String deleteAccount(long account_no){

        accountRepository.deleteById(account_no);
        return "Successfully deleted data from DATABASE......";
    }
}