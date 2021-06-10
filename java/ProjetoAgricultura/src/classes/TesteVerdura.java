package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TesteVerdura {
	public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner leia = new Scanner(System.in);
			
			
			List <Verdura> listaVerdura = new ArrayList<>();
			
			System.out.println("Quantas verduras deseja adicionar? ");
			int quantidade = leia.nextInt();
			
			for (int x=1; x<=quantidade; x++) {
			
			System.out.println("Qual tipo de verdura você produz? ");
			String tipoVerdura = leia.next();
			System.out.println("Quantos quilos você pode doar? ");
			double kgDoados = leia.nextDouble();
			System.out.println("Qual o valor do quilo? ");
			double precoKilo = leia.nextDouble();
			
			listaVerdura.add(new Verdura (tipoVerdura, kgDoados, precoKilo) );
			
			}
			
			for(Verdura lista:listaVerdura) {
				
				System.out.println("Foram doados " +lista.kgDoados+ "KG da verdura "+lista.tipoVerdura+" no valor de "+lista.precoKilo+" por quilo.");
			}
			
	}

}
