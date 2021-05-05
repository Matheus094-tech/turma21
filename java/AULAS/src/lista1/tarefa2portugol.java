package lista1;

import java.util.Locale;
import java.util.Scanner;

public class tarefa2portugol {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	double dia;
	double mes;
	double ano;
	double dias;
	double resultado;
	
			
	System.out.print("Digite sua data de nascimento em dias: ");
	dias = leia.nextInt();
	
	ano = (dias/365);
	mes = (dias % 365) / 30;
	dia = (dias % 365) % 30;

	
	System.out.print(+ano+ " anos " +mes+ " meses e " +dia+ " dias.");
}
}