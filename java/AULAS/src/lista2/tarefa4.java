package lista2;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
	número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	ímpar exiba o número elevado ao quadrado.*/


public class tarefa4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia= new Scanner(System.in);
		int numero;
	
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		if ((numero%2)==0) {
			System.out.println("O número é par.");
			System.out.println("A raiz quadrada desse número é "+Math.sqrt(numero));
		}	else {
			System.out.println("O número é ímpar.");
			System.out.println("O número elevado ao quadrado é "+numero*numero);
		}	
		
	}
	

}
