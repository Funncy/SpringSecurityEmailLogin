package com.lnf.demo;

import com.lnf.demo.Data.User;
import com.lnf.demo.Data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LnfApplication{

	public static void main(String[] args) {
		SpringApplication.run(LnfApplication.class, args);
	}
}
