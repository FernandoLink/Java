package br.com.link.escola.academico.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

import br.com.link.escola.shared.dominio.CPF;

public class Aluno {

	private CPF cpf;
	private String nome;
	private Email email;
	private List<Telefone> telefones = new ArrayList<>();
	private String senha;

	public Aluno(CPF cpf, String nome, Email email) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
	}

	public void adicionarTelefone(String ddd, String telefone) {
		if (telefones.size() == 2) {
			throw new IllegalArgumentException("Numero maximo de telefones ja atingido!");
		}
		this.telefones.add(new Telefone(ddd, telefone));
	}

	public CPF getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email.getEndereco();
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	@Override
	public String toString() {
		return "Aluno [cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", telefones=" + telefones + "]";
	}

}
