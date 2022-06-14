public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniversario() {
        this.idade++;
    }

    public String toString() {
        return "Pessoa{ nome = " + nome + ", idade = " + idade + ", sexo = " + sexo + " }";    
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return this.sexo;
    }
}
