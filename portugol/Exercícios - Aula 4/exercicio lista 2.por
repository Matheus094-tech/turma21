programa
{
	inclua biblioteca Util
	
	/*Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.*/

	
	funcao inicio()
	{
			 inteiro n1[4][6]
			 inteiro n2[4][6]
			 inteiro m1[4][6]
			 inteiro m2[4][6]
		const inteiro linha  = 4
		const inteiro coluna = 4

		para (inteiro l=0; l<linha; l++)
		{
			para(inteiro c=0; c<coluna; c++)
			{
				n1[l][c] = Util.sorteia(1,9)
				n2[l][c] = Util.sorteia(1,9)
				m1[l][c] = n1[l][c] + n2[l][c]
				m2[l][c] = n1[l][c] - n2[l][c]
			}
			escreva("Valores de n1\n")
			para (l=0; l<linha; l++)
			{
				para(inteiro c=0; c<coluna; c++)
				escreva(m1[l][c])
				
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 820; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */