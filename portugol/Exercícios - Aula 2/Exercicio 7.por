programa
{
	funcao inicio()
	{
		//
		/*Receber valores de base e altura de um triângulo e verificar se são valores válidos
		(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo. */


	real base
	real altura
	real area		
	
	escreva("Digite o valor da base do triângulo em metros: ")
	leia(base) 
	escreva("Digite a altura do triângulo em metros: ")
	leia(altura)
	area = (base * altura )/2 

	se (base > 0 e altura>0)
	{
		escreva("A área do seu triângulo é " +area+ "m²")
	}
	
	senao 
	{
		escreva("Sua área não pode ser calculada, reveja os dados digitados. \nLembre-se que devem ser números positovos maiores que zero")
	
	}

}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 508; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */