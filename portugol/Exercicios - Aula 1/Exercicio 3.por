programa {
	funcao inicio (){
		//Exercício 3
		//inicio
			//variaveis* 
			
		inteiro tempoEvento
		inteiro hora
		inteiro minuto
		inteiro segundo
	
			//entradas*
		escreva("Escreva em segundos o tempo de duração do evento: ")
		leia(tempoEvento)

			//processamento*

		hora = (tempoEvento/3600)
		minuto = (tempoEvento % 3600) / 60
		segundo = (tempoEvento % 3600) % 60
	 

			//saída

		escreva (+hora+"h"+minuto+"min"+segundo+"s")

 			//fim
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 272; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */