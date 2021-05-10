package lista5;
import java.util.Locale;

public class aviaoTeste {

			public static void main(String[] args) {
				
				Locale.setDefault(Locale.US);
				Aviao aviao1 = new Aviao();
				
				aviao1.cia = "GOL";
				aviao1.empresa = "Embraer";
				aviao1.poltronas = 500;
				aviao1.turbinas = 4;
				
		
				System.out.println(aviao1.cia);	
				System.out.println(aviao1.empresa);
				System.out.println(aviao1.turbinas);
				System.out.println(aviao1.poltronas);
				
			}
	}

