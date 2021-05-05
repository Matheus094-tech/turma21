programa
{
	
	funcao inicio()
	{
		//
		/*Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
		horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
		por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
		armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
		trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
		excedente.
		*/


	real c
	real n 
	real excedente
	real salario = 10   

	escreva("Digite as horas trabalhadas: ")
	leia(n)
	excedente = n - 50
	salario = 10 * n 
	se ((excedente > 0))
	{escreva("O total de horas extras foi de " +excedente+ "h, por esse excedente você receberá R$" +salario+  
	 "\nde salário e " +20*excedente+ " referente a hora extra, totalizando assim R$" +(+salario+ + +excedente)+".")	
	}
	senao
	{escreva("Você não realizou hora extras esse mês, seu salário será de R$"+salario+".")
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