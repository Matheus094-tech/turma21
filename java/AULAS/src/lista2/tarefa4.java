package lista2;

import java.util.Locale;
import java.util.Scanner;

/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	�mpar exiba o n�mero elevado ao quadrado.*/


public class tarefa4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia= new Scanner(System.in);
		int numero;
	
		System.out.print("Digite um n�mero: ");
		numero = leia.nextInt();
		
		if ((numero%2)==0) {
			System.out.println("O n�mero � par.");
			System.out.println("A raiz quadrada desse n�mero � "+Math.sqrt(numero));
		}	else {
			System.out.println("O n�mero � �mpar.");
			System.out.println("O n�mero elevado ao quadrado � "+numero*numero);
		}	
		
	}
	

}
