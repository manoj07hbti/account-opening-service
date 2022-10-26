package com.accountopeningservice.accountopeningservice.repository;

import com.accountopeningservice.accountopeningservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
