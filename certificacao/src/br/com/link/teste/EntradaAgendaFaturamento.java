package br.com.link.teste;

public class EntradaAgendaFaturamento {

	private String etapa;
	private String evenFat;
	private String dataPrevista;
	
	public EntradaAgendaFaturamento(String etapa, String evenFat, String dataPrevista) {
		this.etapa = etapa;
		this.evenFat = evenFat;
		this.dataPrevista = dataPrevista;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	public String getEvenFat() {
		return evenFat;
	}

	public void setEvenFat(String evenFat) {
		this.evenFat = evenFat;
	}

	public String getDataPrevista() {
		return dataPrevista;
	}

	public void setDataPrevista(String dataPrevista) {
		this.dataPrevista = dataPrevista;
	}

	@Override
	public String toString() {
		return "EntradaAgendaFaturamento [etapa=" + etapa + ", evenFat=" + evenFat + ", dataPrevista=" + dataPrevista
				+ "]";
	}
	
}
