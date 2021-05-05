programa {
	funcao inicio (){
		//Exercicio 2 
		//inicio
		
			//variaveis* 
		
		inteiro dias
		inteiro dia 
		inteiro mes
		inteiro ano
		inteiro resultado1
	
			//entradas*
		escreva("Digite sua data de nascimento em dias: ")
		leia(dias)
		
			//processamento*

		ano = (dias/365)
		mes = (dias % 365) / 30
		dia = (dias % 365) % 30
	
			//saída
		escreva(+ano+ " anos " +mes+ " meses e " +dia+ " dias.")
	
 			//fim
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */