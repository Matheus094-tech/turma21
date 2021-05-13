package lista5;

import java.util.Locale;

public class funcionarioTeste {

	public static void main(String[] args){
			
			Locale.setDefault(Locale.US);
			Funcionario funcionario1 = new Funcionario();
			
			funcionario1.nome = "Matheus Barbosa";
			funcionario1.cpf = "111.111.111-11";
			funcionario1.email = "matheusbarbosa094@gmail.com";
			funcionario1.carteira = "D9856";
			funcionario1.cargo = "Técnico";
			
	
			System.out.println(funcionario1.nome);	
			System.out.println(funcionario1.cpf);
			System.out.println(funcionario1.email);
			System.out.println(funcionario1.carteira);
			System.out.println(funcionario1.cargo);
			
		}
}
