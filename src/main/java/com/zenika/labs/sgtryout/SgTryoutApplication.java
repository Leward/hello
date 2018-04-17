package com.zenika.labs.sgtryout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@SpringBootApplication
@RestController
public class SgTryoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgTryoutApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "World";
	}

//	@GetMapping("/bonjour")
//	public String bonjour() {
//		String abc = "xyz";
//		return "Monde";
//	}

//	@GetMapping("/hallo")
//	public String hallo() {
//		return "die Welt";
//	}

//	@GetMapping("/selamat")
//	public String selamat() {
//		String test = "test";
//		return "Selamat";
//	}
}
