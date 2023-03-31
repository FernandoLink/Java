package br.com.link.linguagens.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.link.linguagens.api.Linguagem;
import br.com.link.linguagens.api.LinguagemRepository;

@RestController
public class LinguagemController {

	@Autowired
	private LinguagemRepository repositorio;

	@GetMapping("/linguagens")
	public List<Linguagem> obterLinguagens() {
		return repositorio.findAll();
	}

	@PostMapping("/linguagens")
	public Linguagem cadastrarLinguagem(@RequestBody Linguagem linguagem) {
		return repositorio.save(linguagem);
	}

}
