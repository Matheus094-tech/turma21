package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia= new Scanner(System.in);
		double altura1;
		double altura2;
		double base1;
		double base2;
		double area1;
		double area2;
		
		System.out.println("Digite a altura do primeiro retangulo: ");
		altura1 = leia.nextDouble();
		System.out.println("Digite a base do segundo retangulo: ");
		base1 = leia.nextDouble();
		System.out.println("Digite a altura do primeiro retangulo: ");
		altura2 = leia.nextDouble();
		System.out.println("Digite a base do segundo retangulo: ");
		base2 = leia.nextDouble();
		
		area1 = altura1 * base1;
		area2 = altura2 * base2;
		
		if (area1>area2) {
			System.out.printf("O retangulo de maior área é o primeiro, com área de %f.",area1);
		} else if (area2>area1)  {
			System.out.printf("O retangulo de maior área é o segundo, com área de %f.",area2);
		} else {
			System.out.printf("A área dos retangulos são iguais: %f",area1);
		}

	}

}
