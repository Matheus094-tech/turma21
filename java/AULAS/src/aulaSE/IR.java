package aulaSE;

import java.util.Scanner;

public class IR {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		//variaveis
		double salario = 0.00;
		double somaSalario = 0.00;
		final double imposto1 = 0.15;
		final double imposto2 = 0.17;
		final double imposto3 = 0.25;
		double valorImposto = 0.00;
		double valorTotal = 0.00;
		int valorEmergencial = 600*5;
		String nome;
		char genero;
		boolean emergencial;
		
		//entradas
		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		System.out.print("Digite o seu gênero de identificação: ");
		genero = leia.next().charAt(0);
		System.out.print("Digite o seu salário bruto mensal: ");
		salario = leia.nextDouble();
		somaSalario = salario * 12;
		System.out.print("Você recebeu auxílio emergencial? ");
		emergencial = leia.nextBoolean(); 

		
		if (salario<5000 && salario <=6000) {
			valorImposto = somaSalario * imposto1;
			if(emergencial == true);
		}
		
		else if (salario<6000 && salario <=10000) {
			valorImposto = somaSalario * imposto2;
		}
		
		else if (salario>10000) {
			valorImposto = somaSalario * imposto3;
			if(emergencial == true);
			{ valorTotal = valorEmergencial + valorImposto;
			}
		}
	}

}
