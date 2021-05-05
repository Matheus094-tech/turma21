package lista1;

import java.util.Locale;
import java.util.Scanner;

public class tarefa1portugol {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	double dia;
	double mes;
	double ano;
	double resultado1;
	double resultado2;
	
			
	System.out.print("Digite o dia em que você nasceu: ");
	dia = leia.nextInt();
	System.out.print("Digite o mês em que você nasceu: ");
	mes = leia.nextInt();
	System.out.print("Digite o ano em que você nasceu: ");
	ano = leia.nextInt();
	
	resultado1 = (mes*31)+dia+(ano*365);
	resultado2 = 737820-resultado1;

	
	System.out.print("Desde seu nascimento se passaram "+resultado2+" dias.");
}
}