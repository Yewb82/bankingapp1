package net.javaguides.bankingapp1.Repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.javaguides.bankingapp1.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {


}
