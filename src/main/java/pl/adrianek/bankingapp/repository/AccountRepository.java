package pl.adrianek.bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.adrianek.bankingapp.model.Account;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByUsername(String username);
}
