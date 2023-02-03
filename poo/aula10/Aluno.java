public class Aluno extends Pessoa {
    public Aluno(String nome, int idade, String sexo) {
		super(nome, idade, sexo);
		// TODO Auto-generated constructor stub
	}

	private int matricula;
    private String curso;

    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada");
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return this.curso;
    }

}
