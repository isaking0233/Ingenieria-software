package mx.ipn.escom.logginspring.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    "mx.ipn.escom.logginspring.auth.config",
    "mx.ipn.escom.logginspring.auth.controller",
    "mx.ipn.escom.logginspring.auth.entity",
    "mx.ipn.escom.logginspring.auth.repository",
    "mx.ipn.escom.logginspring.auth.service",
    "mx.ipn.escom.logginspring.auth.SistemaAutenticacion"
})
@EnableJpaRepositories(basePackages = "mx.ipn.escom.logginspring.auth.repository")
@EntityScan(basePackages = "mx.ipn.escom.logginspring.auth.entity")
public class LogginspringApplication {
    public static void main(String[] args) {
        SpringApplication.run(LogginspringApplication.class, args);
    }
}
