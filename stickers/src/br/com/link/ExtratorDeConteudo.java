package br.com.link;

import java.util.List;

public interface ExtratorDeConteudo {

	List<Conteudo> extraiConteudos(String json);

}