package lista2;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que entre com três números e coloque em ordem crescente */

public class tarefa2 {


	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner leia= new Scanner(System.in);
	int numero1;
	int numero2;
	int numero3;
		
	System.out.print("Digite um número inteiro: ");
	numero1 = leia.nextInt();
	System.out.print("Digite um número inteiro: ");
	numero2 = leia.nextInt();
	System.out.print("Digite um número inteiro: ");
	numero3 = leia.nextInt();
	
	if (numero1 > numero2 && numero2 > numero3 ) {
		System.out.printf("%d %d %d",numero1,numero2,numero3);
	} 	else if (numero1 > numero3 && numero3 > numero2 ) {
		System.out.printf("%d %d %d",numero1,numero3,numero2);
	}		else if (numero2 > numero1 && numero1 > numero3 ) {
		System.out.printf("%d %d %d",numero2,numero1,numero3);
	}		else if (numero2 > numero3 && numero3 > numero1 ) {
		System.out.printf("%d %d %d",numero2,numero3,numero1);
	}		else if (numero3 > numero1 && numero1 > numero2 ) {
		System.out.printf("%d %d %d",numero3,numero1,numero2);
	}
			else {
		System.out.printf("%d %d %d",numero3,numero2,numero1);
	}

	}
	}