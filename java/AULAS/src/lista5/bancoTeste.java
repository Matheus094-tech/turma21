package lista5;

import java.util.Locale;

public class bancoTeste {

	public static void main(String[] args){
			
			Locale.setDefault(Locale.US);
			Banco conta1 = new Banco();
			
			conta1.titular = "Matheus de Souza Barbosa";
			conta1.agencia = "087";
			conta1.conta = "08745-9";
			conta1.saldo = "R$0,85";
			conta1.situa��o = "Conta Ativa";
			
			
			
	
			System.out.println("Titular da conta � "+conta1.titular);	
			System.out.println("A ag�ncia da conta � "+conta1.agencia);
			System.out.println("O n�mero da conta � "+conta1.conta);
			System.out.println("O saldo atual da conta � "+conta1.saldo);
			System.out.println(conta1.situa��o);
			
		}
}
