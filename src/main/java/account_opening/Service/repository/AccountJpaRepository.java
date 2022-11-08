package account_opening.Service.repository;

import account_opening.Service.model.Account_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface AccountJpaRepository extends JpaRepository<Account_Details,Long> {


    public Account_Details findByName(String name);
}
