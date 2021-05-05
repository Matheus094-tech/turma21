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
	
	System.out.print("Escreva o nome do aluno que irá calcular a média: ");
	nome = leia.next();
	System.out.print("Digita a nota 1: ");
	nota1 = leia.nextDouble();
	System.out.print("Digita a nota 2: ");
	nota2 = leia.nextDouble();
	System.out.print("Digita a nota 3: ");
	nota3 = leia.nextDouble();	
	
	media = (nota1+nota2+nota3)/3;
	 

	
	System.out.print("A média do aluno(a) " +nome+ " é " +media+ ".");
}
}