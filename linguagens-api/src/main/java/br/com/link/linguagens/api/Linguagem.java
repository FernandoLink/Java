package br.com.link.linguagens.api;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "linguagens")
public class Linguagem {

	@Id
	private String id;
	private String title;
	private String image;
	private int ranking;
}
