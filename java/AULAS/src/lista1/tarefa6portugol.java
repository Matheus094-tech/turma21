package lista1;

import java.util.Locale;
import java.util.Scanner;

public class tarefa6portugol {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	int x1;
 	int x2;
 	int y1;
 	int y2;
 	int d ;
 	int d2;
 	int d3;
	
	System.out.print("Digite o valor de X1: ");
	x1 = leia.nextInt();
	System.out.print("Digite o valor de X2: ");
	x2 = leia.nextInt();
	System.out.print("Digite o valor de Y1: ");
	y1 = leia.nextInt();
	System.out.print("Digite o valor de Y2: ");
	y2 = leia.nextInt();	
	
	d = (x2-x1) + (y2-y1);

	d2 = d*d;

	d3 = (int) Math.sqrt(d2);

	
	System.out.print("O valor de D é igual a " +d3+  ".");
}
}