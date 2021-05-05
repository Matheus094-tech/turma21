package lista2;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/


public class tarefa3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia= new Scanner(System.in);
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if (idade >10 && idade<= 14) {
			System.out.print("Você está na categria infantil.");
		} else if (idade >15 && idade<= 17) {
			System.out.print("Você está na categria juvenil.");
		} else if (idade >18 && idade<= 25) {
			System.out.print("Você está na categria adulto.");
		} else {
			System.out.print("Você não se enquadra em nenhuma de nossas categorias.");
		}
		
	}

}
