package com.senac.SenacGames;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController

@SpringBootApplication
public class SenacGamesApplication {


	public static void main(String[] args) {
		SpringApplication.run(SenacGamesApplication.class, args);
	}

}
