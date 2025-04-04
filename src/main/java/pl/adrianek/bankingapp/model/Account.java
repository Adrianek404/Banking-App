package pl.adrianek.bankingapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

@Entity
public class Account implements UserDetails {

    @Getter @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter @Setter
    private String username;
    @Getter @Setter
    private String password;
    @Getter @Setter
    private BigDecimal balance;

    @Getter @Setter
    @OneToMany(mappedBy = "account")
    private List<Transaction> transactions;

    @Getter @Setter
    @Transient
    private Collection<? extends GrantedAuthority> authorities;

    public Account(){

    }

    public Account(String username, String password, BigDecimal balance, List<Transaction> transactions, Collection<? extends GrantedAuthority> authorities) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.transactions = transactions;
        this.authorities = authorities;
    }
}
