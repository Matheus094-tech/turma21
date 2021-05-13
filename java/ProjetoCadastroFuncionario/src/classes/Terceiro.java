package classes;

public class Terceiro extends Funcionario {

	private double adicional;

	
	//construtor
	public Terceiro(String matricula, String nome, double adicional) {
		super(matricula, nome);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	//metodo
	@Override
	public double salario(){
		
		return (horasTrabalhadas * valorHora)+adicional;
	}
	/*
	public void mostrarSalario()
	{
		System.out.printf("O salário deste funcionário é: R$ "+(super.getHorasTrabalhadas() * super.getValorHora()+adicional)+".");
	}
	*/
}
