package classes;

public class Verdura {
	
	public String tipoVerdura;
	protected double kgDoados;
	protected double precoKilo;
	
	//construtor
	public Verdura(String tipoVerdura, double kgDoados, double precoKilo) {
		super();
		this.tipoVerdura = tipoVerdura;
		this.kgDoados = kgDoados;
		this.precoKilo = precoKilo;
	}

	//getters
	public String getTipoFruta() {
		return tipoVerdura;
	}

	public void setTipoFruta(String tipoFruta) {
		this.tipoVerdura = tipoFruta;
	}

	public double getKgDoados() {
		return kgDoados;
	}

	public void setKgDoados(double kgDoados) {
		this.kgDoados = kgDoados;
	}

	public double getPrecoKilo() {
		return precoKilo;
	}
	
	public void setPrecoKilo(double precoKilo) {
		this.precoKilo = precoKilo;
	}
}
