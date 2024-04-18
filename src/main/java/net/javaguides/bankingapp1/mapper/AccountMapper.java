package net.javaguides.bankingapp1.mapper;

import net.javaguides.bankingapp1.dto.AccountDto;
import net.javaguides.bankingapp1.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){

        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }

    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getCardHolderName(),
                account.getBalance()

        );
        return accountDto;
    }
}
