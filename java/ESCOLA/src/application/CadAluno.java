package application;

import java.util.Scanner;

import entites.Aluno;

public class CadAluno {

	public static void main(String[] args) {
		
		//teste usuário
		
		//teste programador para programador 
		
		Scanner leia= new Scanner(System.in);
		Aluno aluno1 = new Aluno(1,"Matheus","111.111.111-11");		//instanciou o objeto aluno1 do tipo Aluno
		Aluno aluno2 = new Aluno(2,"Bruna","111.111.111-11");
		Aluno aluno3 = new Aluno(1,"Artur");
		
		aluno1.nome = "Matheus"    ;
		aluno2.nome = "Bruna"  	   ;
		aluno1.anoNascimento = 1998;
		
		System.out.println(aluno1.nome)			;
		System.out.println(aluno1.anoNascimento);
		System.out.println(aluno1.matricula)	;
			
		aluno1.mostrarIdade()	 ;
		aluno1.mostrarIdade(2030);

	}

}
