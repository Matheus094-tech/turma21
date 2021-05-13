package lista6;

import java.util.Scanner;

public class ProgramaSom {

	public static void main(String[] args) {


		Scanner leia = new Scanner(System.in);
		
		Cachorro cachorro = new Cachorro ("Rex",8,"auau","correr");
		//Preguica preguica = new Animal ();
		//Cavalo cavalo     = new Animal ();

		
		System.out.println("O nome do animal é "+cachorro.getNome()+" e sua idade é "+cachorro.getIdade()+" anos, ele gosta de "+cachorro.getAcao());
		System.out.println("Ele emite o som: ");
		cachorro.som();
		cachorro.acao();
}
}
