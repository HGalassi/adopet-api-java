package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"repository"})
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"entities"})
@ComponentScan({
        "controller"})
public class AdopetApiSpring {

    public static void main(String[] args) {
        SpringApplication.run(AdopetApiSpring.class, args);
    }
}
