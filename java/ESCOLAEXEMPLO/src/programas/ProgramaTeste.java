package programas;

import java.util.Scanner;

import classes.Basico;
import classes.Estudante;

public class ProgramaTeste {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Estudante alunoEd = new Estudante (484,"111.111.111-11"); //instanciamento do objet
		Estudante alunoDaAline = new Estudante (287,"222.222.222-22",true);
		
		alunoEd.setCpf("XXX.XXX.XXX-XX");
		
		System.out.println(alunoEd.getCpf());
		System.out.println(alunoDaAline.getCpf());
		System.out.println("Digite o nome do aluno do Ed: ");
		String nome = leia.next();
		alunoEd.setNome(nome);
		System.out.println("Digite a nota do aluno do Ed: ");
		double nota = leia.nextDouble();
		alunoEd.adicionarNota(nota);
		System.out.println("A matrícula do aluno "+alunoEd.getNome()+" é "+alunoEd.getMatricula()+" e a nota é : "+alunoEd.getPontos());

	}

}
