package pl.adrianek.bankingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.adrianek.bankingapp.model.Transaction;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByAccountId(long accountId);
}
