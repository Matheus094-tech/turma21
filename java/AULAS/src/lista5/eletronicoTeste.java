package lista5;

import java.util.Locale;

public class eletronicoTeste {

	public static void main(String[] args){
			
			Locale.setDefault(Locale.US);
			Eletronico produto1 = new Eletronico();
			
			produto1.tipo = "Eletrodoméstico";
			produto1.preco = "R$4.899,99";
			produto1.categoria = "Geladeira";
			produto1.voltagem = "110/220V";
	
			System.out.println("O produto se enquandra no tipo "+produto1.tipo);	
			System.out.println("O produto custa "+produto1.preco);
			System.out.println("A produto está categorizado como "+produto1.categoria);
			System.out.println("A voltagem do produto é "+produto1.voltagem);	
		}
}