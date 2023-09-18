package com.example.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

// Define o caminho de todos os métodos inseridos na classe
@RequestMapping(path = "/calculadora")
public class CalculadoraController {
	
	// /calculadora/somar/10/20
	// /calculadora/subtratir?a=10&b=39
	
	@GetMapping(path = "/somar/{a}/{b}")
	public Integer somar(@PathVariable int a, @PathVariable int b) {
		return (a + b);
	}
	
	@GetMapping(path = "/subtrair")
	public Integer subtrair(
			@RequestParam(name = "a") int a, 
			@RequestParam(name = "b") int b) {
		return (a - b);
	}

}
