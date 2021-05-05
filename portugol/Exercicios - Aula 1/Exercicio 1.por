programa {
	funcao inicio (){
		//Exercicio 1 
		//inicio
		
			//variaveis* 
		cadeia data
		real dia
		real mes 
		real ano
		real resultado
		real resultado2
	
			//entradas*
		escreva("Digite o dia em que você nasceu:")
		leia (dia)
		escreva("Digite o mês em que você nasceu:")
		leia (mes)
		escreva("Digite o ano em que você nasceu:")
		leia (ano)
			
			//processamento*
			resultado = (mes*31)+dia+(ano*365)
			resultado2 = 737811-resultado
	
			//saída
		escreva(resultado2)
 			//fim
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 57; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */