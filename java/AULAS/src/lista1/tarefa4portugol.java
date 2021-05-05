package lista1;

import java.util.Locale;
import java.util.Scanner;

public class tarefa4portugol {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	int a;
	int b;
	int c;
	int r;
	int s;
	double d;
	
	System.out.print("Digite o primeiro o valor de A: ");
	a = leia.nextInt();
	System.out.print("Digite o primeiro o valor de B: ");
	b = leia.nextInt();
	System.out.print("Digite o primeiro o valor de C: ");
	c = leia.nextInt();
	
 	r = (a+b) * (a+b); 
    s = (c+b) * (c+b);
	 

	
	System.out.print("O valor de D é igual a " + (r+s)/2 + ".");
}
}