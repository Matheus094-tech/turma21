package lista2;

import java.util.Locale;
import java.util.Scanner;

/*Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/

public class tarefa1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia= new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		
		System.out.print("Digite um n�mero inteiro: ");
		numero1 = leia.nextInt();
		System.out.print("Digite um n�mero inteiro: ");
		numero2 = leia.nextInt();
		System.out.print("Digite um n�mero inteiro: ");
		numero3 = leia.nextInt();
		
		if (numero1 > numero2 && numero2 > numero3 ) {
			System.out.printf("Dentre os n�mero inseridos o maior � %d",numero1);
		} else if (numero1 > numero3 && numero3 > numero2 ) {
			System.out.printf("Dentre os n�mero inseridos o maior � %d",numero1);
	}	else if (numero2 > numero1 && numero1 > numero3 ) {
			System.out.printf("Dentre os n�mero inseridos o maior � %d",numero2);
	}		else if (numero2 > numero3 && numero3 > numero1 ) {
			System.out.printf("Dentre os n�mero inseridos o maior � %d",numero2);
	}		else if (numero3 > numero1 && numero1 > numero2 ) {
			System.out.printf("Dentre os n�mero insedos o maior � %d",numero3);
	}
			else {
			System.out.printf("Dentre os n�mero inseridos o maior � %d",numero3);
}
}

}