package by.pochikovskaya.springlab.service;


import by.pochikovskaya.springlab.dto.ComputerDto;
import by.pochikovskaya.springlab.model.Computer;

import java.util.List;

public interface ComputerService {
    Computer getComputerById(Long id);
    List<Computer> getAllComputers();
    List<Computer> getFreeComputers(boolean free);
    List<Computer> getComputersByCpu(String cpu);
    List<Computer> getComputersByRam(int ram);
    List<Computer> getComputersByDrive(String drive);
    Computer saveComputer(ComputerDto computerDto);
    Computer updateComputer(ComputerDto computerDto);
    void deleteComputerById(Long id);
}