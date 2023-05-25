package org.sid.bankaccountservice.web;

import org.sid.bankaccountservice.dto.BankAccountRequestDTO;
import org.sid.bankaccountservice.dto.BankAccountResponseDTO;
import org.sid.bankaccountservice.entities.BankAccount;
import org.sid.bankaccountservice.repositories.BankAccountRepository;
import org.sid.bankaccountservice.service.AccountServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AccountRestController
{
    private BankAccountRepository bankAccountRepository;

    private AccountServiceImpl accountService;

    public AccountRestController(BankAccountRepository bankAccountRepository, AccountServiceImpl accountService) {
        this.bankAccountRepository = bankAccountRepository;
        this.accountService = accountService;
    }

    @GetMapping("/bankAccounts")
    public List<BankAccount> bankAccounts()
    {
        return bankAccountRepository.findAll();
    }

    @GetMapping("/bankAccounts/{Id}")
    public BankAccount bankAccount(@PathVariable String Id)
    {
        return bankAccountRepository.findById(Id)
                .orElseThrow(()->new RuntimeException(String.format("Account % not Found",Id)));
    }

    @PostMapping("/bankAccounts")
    public BankAccountResponseDTO save(@RequestBody BankAccountRequestDTO requestDTO)
    {
        /*if(bankAccount.getId()==null)bankAccount.setId(UUID.randomUUID().toString());
        if (bankAccount.getCreatedAt()==null)bankAccount.setCreatedAt(new Date());
        return bankAccountRepository.save(bankAccount);*/
        return accountService.addAccount(requestDTO);
    }


    @PutMapping("/bankAccounts/{Id}")
    public BankAccount update(@PathVariable String Id, @RequestBody BankAccount bankAccount)
    {
        BankAccount account = bankAccountRepository.findById(Id).orElseThrow(()->new RuntimeException(String
                .format("Account %s not Found!!",Id)));;
        if(bankAccount.getBalance() != null)
            account.setBalance(bankAccount.getBalance());
        if(bankAccount.getType() != null)
            account.setType(bankAccount.getType());
        if(bankAccount.getCurrency() != null)
            account.setCurrency(bankAccount.getCurrency());
        if(bankAccount.getCreatedAt() != null)
            account.setCreatedAt(bankAccount.getCreatedAt());
        return bankAccountRepository.save(account);
    }

    @DeleteMapping("/bankAccounts/{Id}")
    public void delete(@PathVariable String Id)
    {
        bankAccountRepository.deleteById(Id);
    }
}
