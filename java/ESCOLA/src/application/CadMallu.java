package application;

import java.util.Scanner;

import entites.Aluno;

public class CadMallu {
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Digite o nome do aluno: ");
	String nome = leia.next().toUpperCase();
	System.out.println("Digite o cpf do aluno: ");
	String cpf = leia.next();
	System.out.println("Informe o número da matrícula: ");
	int matricula = leia.nextInt();
	
	Aluno aluno1 = new Aluno (matricula,cpf,nome);
	Aluno aluno2 = new Aluno (matricula,nome);
	
	System.out.println(aluno1.nome);
	System.out.println(aluno2.nome);
}
}