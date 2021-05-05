programa
{
	
	funcao inicio()
	{
		inteiro peso
		inteiro resultado =0
		real media
		inteiro maior = 0
		inteiro menor = 0

		para (inteiro y = 1; y<=5 ; y++){
			escreva("Digite o peso [valor inteiro] :")
			leia(peso)
			resultado = resultado + peso
			se(peso > maior){
				maior = peso
			}
			se(peso <=* 10){
				menor++
			}
		}
		media = resultado / 5
		escreva("Peso total = " ,resultado,".")
		escreva("\nA média de peso é ",media,".")
		escreva("\nO maior peso digitado é ",maior,".")
		escreva("\nQuantidade de pesos menores que 10: ",menor,".")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 567; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */