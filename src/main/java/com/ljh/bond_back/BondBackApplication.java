package com.ljh.bond_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BondBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BondBackApplication.class, args);
    }

}
