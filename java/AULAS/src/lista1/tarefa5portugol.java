package lista1;

import java.util.Locale;
import java.util.Scanner;

public class tarefa5portugol {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	double nota1;
	double nota2;
	double nota3;
	double media;
	String nome;
	
	System.out.print("Escreva o nome do aluno que ir� calcular a m�dia: ");
	nome = leia.next();
	System.out.print("Digita a nota 1: ");
	nota1 = leia.nextDouble();
	System.out.print("Digita a nota 2: ");
	nota2 = leia.nextDouble();
	System.out.print("Digita a nota 3: ");
	nota3 = leia.nextDouble();	
	
	media = (nota1+nota2+nota3)/3;
	 

	
	System.out.print("A m�dia do aluno(a) " +nome+ " � " +media+ ".");
}
}