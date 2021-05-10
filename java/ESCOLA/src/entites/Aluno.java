package entites;

public class Aluno {
	
	//atributos - � - tem - estar
	public int matricula;
	public String cpf;
	public String nome;
	public int anoNascimento;
	public char genero;
	public boolean ativo;
	
	//construtor
	
	public Aluno() { //construtor padr�o, usado em teste
		
	}
	
	public Aluno(int matricula, String cpf, String nome) {
		
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		
	}
	public Aluno(int matricula, String nome) {
		
		this.matricula = matricula;
		this.nome = nome;
		
	}
	
	//metodos - comportamento - faz - verbo/adverbios
	public void mostrarIdade() {
		System.out.println("A idade � "+(2021-anoNascimento));
	}

	//sobrecarga
	public void mostrarIdade(int anoAtual) {
		System.out.println("A idade � "+(anoAtual-anoNascimento));
	}
}
