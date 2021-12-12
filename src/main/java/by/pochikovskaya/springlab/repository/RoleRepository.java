package by.pochikovskaya.springlab.repository;


import by.pochikovskaya.springlab.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
