package by.pochikovskaya.springlab.service;


import by.pochikovskaya.springlab.dto.ContractDto;
import by.pochikovskaya.springlab.model.Contract;

import java.util.List;

public interface ContractService {
    Contract getContractById(Long id);
    List<Contract> getAllContracts();
    List<Contract> getActiveContract(boolean active);
    List<Contract> getContractByComputer(Long id);
    List<Contract> getContractByUserId(Long id);
    Contract saveContract(ContractDto dto);
    Contract updateContract(ContractDto dto);
    void deleteContract(Long id);
}
