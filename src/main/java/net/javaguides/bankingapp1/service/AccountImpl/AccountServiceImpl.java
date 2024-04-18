package net.javaguides.bankingapp1.service.AccountImpl;

import net.javaguides.bankingapp1.Repository.AccountRepository;
import net.javaguides.bankingapp1.dto.AccountDto;
import net.javaguides.bankingapp1.entity.Account;
import net.javaguides.bankingapp1.mapper.AccountMapper;
import net.javaguides.bankingapp1.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account= AccountMapper.mapToAccount(accountDto);
        Account savedAccount= accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
