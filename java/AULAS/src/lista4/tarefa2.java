package lista4;

import java.util.Locale;
import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leia= new Scanner(System.in);
		
		int numero[] = new int [6];
		int par=0;
		int impar=0;
		int somaPar=0;
		int somaImpar=0;
		
		for (int x=0;x<6;x++) {
		System.out.println("Digite um n�mero inteiro: ");
		numero[x] = leia.nextInt();
		
		if ((numero[x]%2)==0) {
			par++;
			System.out.println(numero[x]);
			somaPar+=numero[x];
		}
			else {
				impar++;
				System.out.println(numero[x]);
				somaImpar+=numero[x];
			}
		}
		System.out.println("A quantidade de n�meros pares digitados � de "+par+".");
		System.out.println("A quantidade de n�meros impares digitados � de "+impar+".");
		System.out.println("A soma dos n�meros pares inseridos � "+somaPar+".");
		System.out.println("A soma dos n�meros �mpares inseridos � "+somaImpar+".");
}
}