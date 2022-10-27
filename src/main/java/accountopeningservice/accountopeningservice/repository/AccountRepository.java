package accountopeningservice.accountopeningservice.repository;

import accountopeningservice.accountopeningservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
}
