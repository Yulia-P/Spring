package by.pochikovskaya.springlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = {"by.pochikovskaya.springlab.model"} )
@EnableJpaRepositories(basePackages = {"by.pochikovskaya.springlab.repository"})
public class SpringlabApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringlabApplication.class, args);
    }

}
