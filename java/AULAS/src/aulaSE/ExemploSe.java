package aulaSE;

import java.util.Locale;
import java.util.Scanner;

public class ExemploSe {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia= new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um número inteiro: ");
		numero = leia.nextInt();
			
		/* se o numero for 0 = zero é neutro
		 * se for par = par
		 * se for impar = impar
		 * se for negativo = negativo
		 * se ((numero%2)==0){
		 * escreva("Numero par")
		 */
		
		if (numero==0) {
			System.out.println("O número é neutro.");}
		
			else if (numero<0) {
				System.out.println("Número é negativo");
			}
		else if ((numero%2)==0) {
			System.out.println("O número é par.");}
			else {
				System.out.println("O número é ímpar");
			}
		} 
					
	}
