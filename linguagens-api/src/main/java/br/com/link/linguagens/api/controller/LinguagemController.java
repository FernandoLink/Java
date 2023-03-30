package br.com.link.linguagens.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.link.linguagens.api.Linguagem;

@RestController
public class LinguagemController {

	private List<Linguagem> linguagens = List.of(new Linguagem("Java", "imagem", 1));

	@GetMapping(value = "/linguagem-preferida")
	public String processaLinguagemPreferida() {
		return "Oi, Spring Web Lombok!";
	}

}
