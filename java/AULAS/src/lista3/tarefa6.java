package lista3;

import java.util.Scanner;

public class tarefa6 {
	
	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		int num, somaMultiplo3=0, qntNumeros=0;
		double media=0.00;
		
		do
		{
			System.out.println("Informe um valor inteiro e positivo: ");
			num = leia.nextInt();
			
			
			if (num != 0 && num%3==0)
			{
				qntNumeros++; //totalizador
				somaMultiplo3 = somaMultiplo3 + num;
			}
			
			
		}
		while(num != 0);
		
		media = somaMultiplo3 / qntNumeros;
		
		System.out.println("A média dos numero informados e multiplos de 3 é de: " + media);
		
		leia.close();
		
	}
}