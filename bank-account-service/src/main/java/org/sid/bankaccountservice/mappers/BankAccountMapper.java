package org.sid.bankaccountservice.mappers;

import org.modelmapper.ModelMapper;
import org.sid.bankaccountservice.dto.BankAccountResponseDTO;
import org.sid.bankaccountservice.entities.BankAccount;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class BankAccountMapper
{
    private ModelMapper modelMapper = new ModelMapper();
    public BankAccountResponseDTO from(BankAccount bankAccount)
    {
        BankAccountResponseDTO bankAccountResponseDTO = new BankAccountResponseDTO();
        BeanUtils.copyProperties(bankAccount,bankAccountResponseDTO);
        return bankAccountResponseDTO;
    }
}
