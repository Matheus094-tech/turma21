package lista5;

import java.util.Locale;

public class clienteTeste {

	public static void main(String[] args){
			
			Locale.setDefault(Locale.US);
			Cliente cliente1 = new Cliente();
			
			cliente1.nome = "Matheus";
			cliente1.cpf = "111.111.111-11";
			cliente1.email = "matheusbarbosa094@gmail.com";
			cliente1.anoNascimento = 1998;
			cliente1.genero = 'M';
			
	
			System.out.println(cliente1.nome);	
			System.out.println(cliente1.cpf);
			System.out.println(cliente1.email);
			System.out.println(cliente1.anoNascimento);
			System.out.println(cliente1.genero);
			
		}
}
