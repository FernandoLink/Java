
public class ControleBonificacao {

	private double soma;

	public void registra(Funcionario f) {
		double bonificacao = f.getBonificacao();
		this.setSoma(bonificacao);
	}

	public double getSoma() {
		return soma;
	}

	public void setSoma(double soma) {
		this.soma += soma;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
