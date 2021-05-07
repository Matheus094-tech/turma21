package lista3;

import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int par = 0;
		int impar = 0;
		System.out.println("Digite 10 números.");
		for (int i = 0; i < 10; i++) {
			System.out.printf("Número %d : ", (i+1));
			numero = leia.nextInt();
			
			if (numero == 0 ) {
				
			}else if (numero % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		System.out.printf("\nNúmero(s) par." +par);
		System.out.printf("\nNúmero(s) impar." +impar);

		leia.close();

	}

}
