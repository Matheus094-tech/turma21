package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class EnquantoJava {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia= new Scanner(System.in);
		int numero=1;
		int somatorio=0;
		int media=0;
		int totalValoresLidos=0; 
		int qtdVezes=0;
		

		while (numero >= 0)
		{
			System.out.println("Informe um numero positivo: ");
			numero = leia.nextInt();

		somatorio = somatorio + numero;

			if (numero>0)
			{
				totalValoresLidos++;
			}

		media = somatorio / totalValoresLidos;
		
		}

		System.out.printf("\nA soma dos valores informados é de: %d", somatorio);
		System.out.printf("\nA quantidade de vezes que foram informados numeros positivos foi de: %d" ,totalValoresLidos);
		System.out.printf("\nA média dos numeros informados é: %d", media);
		 
	}

}
