programa {
	inclua biblioteca Matematica
	funcao inicio (){
		 
		
		//Exercício 6
		//inicio
			//variaveis* 
			
		inteiro x1
     	inteiro x2
     	inteiro y1
     	inteiro y2
     	inteiro d 
     	inteiro d2
     	inteiro d3
    
	
			//entradas*
		escreva("Digite o valor de X1: ")
     	leia (x1)
     	escreva("Digite o valor de X2: ")
     	leia (x2)
     	escreva("Digite o valor de Y1: ")
     	leia (y1)
     	escreva("Digite o valor de Y2: ")
     	leia (y2)


			//processamento*

		  	d = (x2-x1) + (y2-y1)

		  	d2 = Matematica.potencia(d, 2)

		  	d3 = Matematica.raiz(+d2, 2)

			//saída

		escreva("O valor de D é igual a " +d3+  ".") 

 			//fim
		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 82; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */