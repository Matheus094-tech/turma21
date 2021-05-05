programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		caracter opcao

		faca {
			escreva("Digite o código da opção: ")
			escreva("\n1- Basico\n2- Médio\n3- Graduação\n4- Sair\n")
			leia(opcao)
			se (opcao == '1'){
				limpa()
				escreva("Ensino básico\n")
				Util.aguarde(1000)
				}
				senao se (opcao == '2'){
				limpa()
				escreva("Ensino médio\n")
				Util.aguarde(1000)
				}
				senao se (opcao == '3'){
				limpa()
				escreva("Ensino Superior\n")
				Util.aguarde(1000)
				}
				
			}
	
		enquanto (opcao!='4')
		escreva("\nPrograma finalizado\n")
	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 572; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */