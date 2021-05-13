package programas;

import java.util.Scanner;

import classes.Basico;

public class ProgramaTesteBasico {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o nome do aluno: ");
		String nome = leia.next().toUpperCase();
		System.out.println("Digite o n�mero da matricula: ");
		int matricula = leia.nextInt();
		System.out.println("Digite o n�mero do CPF: ");
		String cpf = leia.next();
		System.out.println("Digite o dia do anivers�rio: ");
		int dia = leia.nextInt();
		System.out.println("Digite a nota inicial do aluno: ");
		double nota = leia.nextDouble();
		
		Basico aluno1 = new Basico(matricula,cpf,dia); //instanciando o objeto
		aluno1.setNome(nome);
		aluno1.adicionarNota(nota);
		System.out.printf("Pontos atuais do aluno %s = %.0f ",aluno1.getNome(),aluno1.getPontos());
		System.out.println("\nDigite o dia atual: ");
		int diaAtual = leia.nextInt();	
		aluno1.bonusAniversario(diaAtual);
		System.out.printf("Pontos ap�s m�todo do aluno %s = %.0f ",aluno1.getNome(),aluno1.getPontos());
	}

}
