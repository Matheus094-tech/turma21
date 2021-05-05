programa
{
	
	funcao inicio()
	{
		//ler um numero inteiro positivo e dizer se ele é par ou impar

	cadeia nome
	caracter genero
	inteiro nascimento
	inteiro idade

	escreva("Digite seu nome: ")
	leia(nome)
	escreva("Digite seu gênero, utilize m para masculino, f para feminino e o se for outro: ")
	leia(genero)
	escreva("Digite seu ano de nascimento: ")
	leia(nascimento)

	idade = 2021 - nascimento 


	se ( idade <= 18 )
	se ( genero == 'm') 
		{escreva("Olá, " +nome+ ", sua idade é " +idade+ " anos e você é jovem.")}
	
	se ( idade >=19 e idade <=50 )
	se ( genero == 'm') 
		{escreva("Olá, " +nome+ ", sua idade é " +idade+ " anos e você é adulto.")}
		senao se ( genero == 'f') 
		{escreva("Olá, " +nome+ ", sua idade é " +idade+ " anos e você é adulta.")}
		senao se ( genero == 'o') 
		{escreva("Olá, " +nome+ ", sua idade é " +idade+ " anos e você é adulte.")} 

	se ( idade >= 51 )
	se ( genero == 'm') 
		{escreva("Olá, " +nome+ ", sua idade é " +idade+ " anos e você é idoso.")}
		senao se ( genero == 'f') 
		{escreva("Olá, " +nome+ ", sua idade é " +idade+ " anos e você é idosa.")}
		senao se ( genero == 'o') 
		{escreva("Olá, " +nome+ ", sua idade é " +idade+ " anos e você é idose.")} 
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 449; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */