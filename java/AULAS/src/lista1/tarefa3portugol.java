package lista1;

import java.util.Locale;
import java.util.Scanner;

public class tarefa3portugol {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	int tempoEvento;
	int hora;
	int minuto;
	int segundo;
	
	System.out.print("Escreva em segundos o tempo de duração do evento: ");
	tempoEvento = leia.nextInt();
	
	hora = (tempoEvento/3600);
	minuto = (tempoEvento % 3600) / 60;
	segundo = (tempoEvento % 3600) % 60;

	
	System.out.print(+hora+"h"+minuto+"min"+segundo+"s");
}
}