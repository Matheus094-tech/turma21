programa
{
	
	funcao inicio()
	{
		//João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
		//Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo 
		//(50 quilos) deve pagar um multa de R$ 4,00 por quiloexcedente.  
		//João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso. 
		//Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
		//Caso contrário mostrar tais variáveis com o conteúdo ZERO.


	real peso
	real excedente 

	escreva("Digite o peso de tomate em KG: ")
	leia(peso)
	excedente = peso - 50
	se ((excedente > 0))
	{escreva("Pelo excedente de " +excedente+ "KG, você deve pagar R$" +4*excedente)	
}
	senao
	{escreva("Não excedeu o limite de 50KG, então a multa é zero")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 29; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */