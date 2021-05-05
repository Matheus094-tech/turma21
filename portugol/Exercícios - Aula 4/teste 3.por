programa
{
	
	funcao inicio()
	{
	//variaveis

	cadeia  alunes   [3]
	real    notas    [3]
	cadeia  mensagem
	inteiro numero
	
	//entrada

	alunes[0] = "Pedro"
	notas [0] = 7.0
	alunes[1] = "Maria"
	notas [1] = 8.0
	alunes[2] = "Ariel"
	notas [2] = 9.0 

	para (inteiro x=0; x<3; x++)
	{
		escreva("Digite o nome do alune :")
		leia(alunes[x])
		escreva("Digite a nota: ")
		leia(notas[x])
	}
	escreva("\n")
	para (inteiro x=0; x<3; x++)
	{
		se (notas[x] <= 5)
		{
			mensagem = ":(, se dedique mais!"
		}
	senao 
	{
		mensagem = ":), continue assim!"
	}
	escreva("\n" ,alunes[x]," sua nota é ",notas[x],"!\n",mensagem)
	}
	
	
	/*escreva("Digite o número do alune entre 0 e 2: ")
	leia(numero)
	
	//processamento

	se (notas[numero] <= 5)
		{
			mensagem = ":(, se dedique mais!"
		}
	senao 
	{
		mensagem = ":), continue assim!"
	}
	//saida

	escreva(alunes[numero]," sua nota é ",notas[numero],"!\n",mensagem)*/


	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 164; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */