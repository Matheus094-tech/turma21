package lista1;

import java.util.Locale;
import java.util.Scanner;

public class tarefa7portugol {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);
	int a;
 	int b;
 	int c;
 	int d;
 	int ee;
 	int f;
 	int x;
 	int y;
 	int conta1;
 	int conta2;
 	int conta3;
 	int conta4;
	
	System.out.print("Digite o valor de a: ");
	a = leia.nextInt();
	System.out.print("Digite o valor de b: ");
	b = leia.nextInt();
	System.out.print("Digite o valor de c: ");
	c = leia.nextInt();
	System.out.print("Digite o valor de d: ");
	d = leia.nextInt();	
	System.out.print("Digite o valor de e: ");
	ee = leia.nextInt();	
	System.out.print("Digite o valor de f: ");
	f = leia.nextInt();	
	
		conta1 = (c*ee) - (b*f);
		conta2 = (a*ee) - (b*d);
		conta3 = (a*f) - (c*d);
		conta4 = (a*ee) - (b*d);
		x = (conta1/conta2);
		y = (conta3/conta4);

	
	System.out.print("O valor de X é igual a " +x+  " e o valor de Y é igual a " +y+ ".");
}
}