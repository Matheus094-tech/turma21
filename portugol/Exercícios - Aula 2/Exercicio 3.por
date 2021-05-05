programa
{
	funcao inicio()
	{
		//
		/*Desenvolva um sistema em que:
		Leia 4 (quatro) números;
		Calcule o quadrado de cada um;
		Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
		Caso contrário, imprima os valores lidos e seus respectivos quadrados.
		*/


	real um
	real dois
	real tres
	real quatro
	real quadrado1
	real quadrado2
	real quadrado3
	real quadrado4

	escreva("Digite o primeiro número ao lado: ")
	leia(um)
	escreva("Digite o segundo número ao lado: ")
	leia(dois)
	escreva("Digite o terceiro número ao lado: ")
	leia(tres)
	escreva("Digite o quarto número ao lado: ")
	leia(quatro)

	quadrado1 = um*um
	quadrado2 = dois*dois
	quadrado3 = tres*tres
	quadrado4 = quatro*quatro
	
	se (quadrado3>=1000)
	{escreva("O resultado do quadradro do terceiro número é: " +tres*tres)
	}
	senao {escreva("O números digitados foram: " +um+ ", " +dois+ ", " +tres+ ", " +quatro+ 
	"\n,e seus quadrados são, respectivamente: " +quadrado1+ ", " +quadrado2+ ", " +quadrado3+ ", " +quadrado4+ ".")
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */