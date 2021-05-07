package lista4;

import java.util.Scanner;

public class tarefa4 {

	public static void main(String[] args) {
		/*4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes
		(2) subtrair a primeira matriz da segunda
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
		da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.*/

		Scanner leia= new Scanner(System.in);
		double matriz1		[][] =    new double    [2][2]; //linha e coluna
		double matriz2		[][] = 	  new double    [2][2];
		double matrizSoma	[][] =    new double	[2][2];
		double matrizSubtrair	[][] =    new double	[2][2];
		double auxCostante		 =	  0.00;
		char op ;
		
		for (int linha=0; linha<2; linha++) {
			for(int coluna=0; coluna<2; coluna++) {
				System.out.printf("Valor da matriz1 na posição %d - %d :",linha,coluna);
				matriz1[linha][coluna]=leia.nextDouble();
				System.out.printf("Valor da matriz2 na posição %d - %d :",linha,coluna);
				matriz2[linha][coluna]=leia.nextDouble();
			}
		}
		do {
			System.out.println("1 - Somar as duas matrizes");
			System.out.println("2 - Subtrair a primeira matriz da segunda");
			System.out.println("3 - Adicionar uma constante as duas matrizes");
			System.out.println("4 - Imprimir as matrizes e sair");
			op = leia.next().charAt(0);
			switch (op)
			{
				case '1':
				{
					for(int linha=0; linha<2; linha++) {
						for(int coluna=0; coluna<2; coluna++){
							matrizSoma[linha][coluna]=matriz1[linha][coluna]+matriz2[linha][coluna];
							
						}
					}
				}
				case '2':
				{
					for(int linha=0; linha<2; linha++) {
						for(int coluna=0; coluna<2; coluna++){
							matrizSubtrair[linha][coluna]=matriz1[linha][coluna]-matriz2[linha][coluna];
							System.out.printf("A subtração das matrizes na posição %d - %d = %.0f + %.0f \n",linha,coluna,matriz1[linha][coluna],matriz2[linha][coluna],matrizSubtrair[linha][coluna]);
					}
					}
				}
				case '3':
					{
						System.out.print("\nDigite o valor da constante: ");
						final double VALOR = leia.nextDouble();
						for(int linha=0; linha<2; linha++) {
							for(int coluna=0; coluna<2; coluna++){
								matriz1[linha][coluna]+=VALOR;
								matriz2[linha][coluna]+=VALOR;
							}
						}
					}
								
				case '4':
				{
					System.out.println("Matriz 1");
					for(int linha=0; linha<2; linha++) {
						for(int coluna=0; coluna<2; coluna++){
							System.out.printf("%.0f\t",matriz1[linha][coluna]);
				}
			}
					System.out.println("\nMatriz 2\n");
					for(int linha=0; linha<2; linha++) {
						for(int coluna=0; coluna<2; coluna++){
							System.out.printf("%.0f\t",matriz2[linha][coluna]);
					}
			}
				}
		}      
		}		while (op !='4');
	}
}
