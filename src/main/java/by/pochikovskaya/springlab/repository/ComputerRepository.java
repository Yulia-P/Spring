package by.pochikovskaya.springlab.repository;


import by.pochikovskaya.springlab.model.Computer;
import by.pochikovskaya.springlab.model.ComputerCpuManufacturer;
import by.pochikovskaya.springlab.model.ComputerDriveType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
    Computer getComputerById(Long id);

    List<Computer> findComputerByIsFree(boolean free);
    List<Computer> findComputerByCpuManufacturer(ComputerCpuManufacturer m);
    List<Computer> findComputerByRamSizeAfter(int ramSize);
    List<Computer> findComputerByDriveType(ComputerDriveType t);

}