package br.com.link.jdbc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private Integer id;
	private String nome;
	private List<Produto> produtos = new ArrayList<Produto>();

	public Categoria(Integer id, String s) {
		this.id = id;
		this.nome = s;
	}

	public String getNome() {
		return nome;
	}

	public int getId() {
		return id;
	}

	public void adicionar(Produto produto) {
		produtos.add(produto);
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}
