package br.com.link.escola.academico.dominio.aluno;

import br.com.link.escola.shared.dominio.CPF;

public class FabricaDeAluno {

	private Aluno aluno;

	public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
		this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
		return this;
	}

	public FabricaDeAluno comTelefone(String ddd, String numero) {
		this.aluno.adicionarTelefone(ddd, numero);
		return this;
	}

	public Aluno criar() {
		return this.aluno;
	}

	@Override
	public String toString() {
		return "FabricaDeAluno [aluno=" + aluno + "]";
	}

	public static void main(String[] args) {
		FabricaDeAluno fabrica = new FabricaDeAluno();
		Aluno aluno = fabrica.comNomeCPFEmail("Fernando Link", "123.456.789-01", "link@gmail.com")
				.comTelefone("41", "999283829").comTelefone("41", "30146538").criar();
		System.out.println(aluno);
	}

}
