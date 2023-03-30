package br.com.link.linguagens.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Linguagem {
	private String title;
	private String image;
	private int ranking;
}
