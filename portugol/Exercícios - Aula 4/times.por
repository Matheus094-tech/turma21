programa
{
	/*G-GANHOU (3), P-PERDEU(0), OU E-EMPATOU(1)
VETOR TIMES
VETOR PONTOS
3 RODADAS
LISTAGEM NOME DE CADA TIME - PONTOS ATUAI
programa
{
	
	funcao inicio()
	{
			cadeia times[3]
			inteiro pontos[3]
			inteiro pontosTotais = 0
			caracter resultado
			
			
			para(inteiro partida = 0; partida <3; partida++)
			{
				escreva("/nQuais times irão jogar?: ")
				leia(times[partida])
				
			para(inteiro jogo = 0; jogo <3; jogo++){

				escreva("rodada ",jogo+1, "o time venceu empatou ou perdeu?: ")
				leia(resultado)
				
				 se (resultado == 'G')
				 {
					pontos[jogo]+=3
				 	
				 }		 
				 senao se(resultado == 'P')
				 {
				 	pontos[jogo] +=0
				 }
				 senao
				 {
				 	pontos[jogo] +=1	
				 }
				 	pontosTotais +=  pontos[jogo]
				
	}
	 escreva("o ", times[partida], " em 3 partidas marcou um total de: ", pontosTotais," pontos")
				 

				}
			
}
}
*/
	funcao inicio()
	{

	cadeia times[4]
	inteiro pontos[3]
	inteiro somaPontos
	caracter resultado


	times[0] = "Corinthians"
	times[1] = "Palmeiras"
	times[2] = "Santos"
	times[3] = "São Paulo"
	pontos[0] = 0
	pontos[1] = 1
	pontos[2] = 3

	para(inteiro rodada=1; rodada<=3; rodada++){
		escreva("O " ,times[0], " ganhou, perdeu ou empatou na rodada " ,rodada, " do campeonato? ") 
		leia(resultado)
		escreva("O " ,times[1], " ganhou, perdeu ou empatou na rodada " ,rodada, " do campeonato? ") 
		leia(resultado)
		escreva("O " ,times[2], " ganhou, perdeu ou empatou na rodada " ,rodada, " do campeonato? ") 
		leia(resultado)
		escreva("O " ,times[3], " ganhou, perdeu ou empatou na rodada " ,rodada, " do campeonato? ") 
		leia(resultado)
	
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 885; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */