package lista6;

public class Cachorro extends Animal {
	
	private String som;
	private String acao;
	
	//construtor
	
	public Cachorro(String nome, int idade, String som, String acao) {
		super(nome, idade);
		this.som = som;
		this.acao = acao;
	}
	//getters
	
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	//metodo
	
	public void som(){
		
		System.out.println("au au au au");
	}
	public void acao(){
		
		System.out.println("ele corre muito");
	}

}
