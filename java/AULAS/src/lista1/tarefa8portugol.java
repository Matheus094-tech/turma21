package lista1;

import java.util.Locale;
import java.util.Scanner;

public class tarefa8portugol {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner leia= new Scanner(System.in);
	double custoFabrica;
	double valorFinal;
	
	System.out.print("Digite o valor de custo do veículo para o fornecedor: R$");
	custoFabrica = leia.nextInt();
	valorFinal = custoFabrica + (custoFabrica * 0.48)+(custoFabrica*0.28);
	
	System.out.print("O custo do carro para o consumidor será: R$" +valorFinal);
}
}