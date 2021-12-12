package by.pochikovskaya.springlab.repository;


import by.pochikovskaya.springlab.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
    User getUserById(Long id);
}
