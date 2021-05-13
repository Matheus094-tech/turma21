package programaPrincipal;

import java.util.Scanner;

import classes.Funcionario;
import classes.Terceiro;

public class CadFuncionario {

	public static void main(String[] args) {
		
		Scanner leia =  new Scanner(System.in);
		Funcionario func1 = new Funcionario ("1234","Matheus");
		Terceiro terc1 = new Terceiro ("1234","Ju",250);
		
		//teste programador
		System.out.println("O nome do funcion�rio da matricula "+func1.getMatricula()+" � "+func1.getNome()+".");
	
		//teste usuario
		System.out.println("\nDigite o nome do funcion�rio terceiro: ");                          
		String nome = leia.next();
		terc1.setNome(nome);
		System.out.println("\nDigite a matr�cula do funcion�rio terceiro: ");                          
		String matricula = leia.next();
		terc1.setMatricula(matricula);
		System.out.println("Digite as horas trabalhadas:  ");
		int horas = leia.nextInt();
		terc1.setHorasTrabalhadas(horas);
		System.out.println("Digite o valor da horas trabalhada: R$");
		double valorHora = leia.nextInt();
		terc1.setValorHora(valorHora);
		System.out.println("Digite o valor do adicional do terceiro: R$");
		double adicional = leia.nextDouble();
		terc1.setAdicional(adicional);
		
		System.out.println("\nO nome do funcion�rio da matricula "+terc1.getMatricula()+" � "+terc1.getNome()+" e o seu sal�rio � de R$"+terc1.salario());
	
		
	}
                                                   
}
