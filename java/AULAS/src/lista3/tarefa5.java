package lista3;

import java.util.Scanner;

public class tarefa5 {
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner (System.in);
	
	int numero =1, soma =0;
	
	do
	{
		System.out.println("Informe um valor ");
		numero = leia.nextInt();
		
		if(numero != 0)
		{
			soma = soma + numero;
		}
	}
	while (numero != 0);
	
	System.out.println("A soma dos valores digitados (exceto o 0) é de " +soma);
	
	leia.close();
}
}