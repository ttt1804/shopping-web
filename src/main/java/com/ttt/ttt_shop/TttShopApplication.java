package com.ttt.ttt_shop;

import com.ttt.ttt_shop.model.entity.User;
import com.ttt.ttt_shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class TttShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TttShopApplication.class, args);


	}

}
