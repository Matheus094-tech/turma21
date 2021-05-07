package Exemplos;

import java.util.Locale;
import java.util.Scanner;

public class FaçaEnquantoJav {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia= new Scanner(System.in);
		int numero=233;
		
		do {
			if (numero >= 300 && numero <=400)
			{
				numero = numero +3;
				System.out.println(+numero);
			}
			if (numero >=233 && numero <300 || numero >400 && numero < 456)
			{
				numero = numero +5;
				System.out.println(+numero); }
		}
			while (numero >= 233 && numero <456);
			}
	}	