package lista4;

import java.util.Locale;

public class tarefa1 {
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	int A [] = { 1, 0, 5, -2, -5, 7};
	int soma;
	
	soma = (A[0] + A[1] + A[5]);

	System.out.println(soma);
	
	A[4]=100;
	
	System.out.println(A[0]);
	System.out.println(A[1]);
	System.out.println(A[2]);
	System.out.println(A[3]);
	System.out.println(A[4]);
	System.out.println(A[5]);
}
}