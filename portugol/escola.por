programa
{
	inclua biblioteca Util
	inclua biblioteca Calendario
	
	funcao inicio()
	{
		//variaveis 
		caracter tipo
		
		//variaveis globais do estudante
		real pontos[10]
		caracter status

		faca {
			escreva ("Escola ED++")
			escreva ("\n,um plus de ensino em sua vida\n")
			escreva("\n1 - BÁSICO\n2 - MÉDIO\n3 - GRADUAÇÃO\n4 - PÓS\n5 - MESTRADO\n6 - SAIR\n")
			escreva("DIGITE O CÓDIGO DA OPÇÃO SELECIONADA: ")
			leia (tipo)
			se (tipo =='1'){
				limpa()
				escreva ("Escola ED++")
				escreva ("\n,um plus de ensino em sua vida\n")
				escreva("\nENSINO BÁSICO")

				dadosEstudante()
	
				escreva("Status: Digite 1 (Ativa) ou 2 (Inativa): ")
				leia(status)
				
				real notaAtual = notas(status)

				//regras de negócios para estudante do ensino básico
				inteiro diaAniversario
				inteiro diaAtual = Calendario.dia_mes_atual()

				limpa()
				escreva ("\nDigite o dia do seu aniversario: ")
				leia(diaAniversario)
				se(diaAniversario == diaAtual){
					notaAtual = (notaAtual * 0.10) + notaAtual
					escreva("\nO total de pontos do estudante é ", notaAtual, "\n")
				}
				senao{
					escreva("\nO total de pontos do estudante é ", notaAtual, "\n")
				}
				
				Util.aguarde(2000)
			}
			senao se (tipo =='2'){
				limpa()
				escreva ("Escola ED++")
				escreva ("\n,um plus de ensino em sua vida\n")
				escreva("\nENSINO MÉDIO")

				dadosEstudante()
	
				escreva("Status: Digite 1 (Ativa) ou 2 (Inativa): ")
				leia(status)
				
				inteiro indice = 0 
				caracter movimentos[10]
				real notaAtual = 0.0
				
				caracter continuar = 'S'
				se(status == '1'){
					enquanto (continuar != 'N'){
						se(indice < 10){
							escreva ("\nTotal atual: ", notaAtual,"\n")
							escreva("MOVIMENTO ", indice + 1," - Digite I (inclusão de nota) ou R (retirada nota): ")
							leia (movimentos[indice])
							escreva("Valor movimento: ")
							leia (pontos[indice])
							    		
							se(movimentos[indice] == 'I'){
						    		notaAtual=+ pontos[indice]
						    	}
						    	senao{
						    		notaAtual=-pontos[indice]
						    	}
						    		indice++	
		
						    		escreva("Continuar? Digite S (Sim) ou N (Não): ")
						    		leia (continuar)
							}		
						senao{
							escreva("\nNÃO É POSSÍVEL INCLUIR OU RETIRAR NOTAS\n")
							continuar = 'N'
						}
					}
				}
				
				//regras de negócios para estudante do ensino médio
				caracter imprimirBoletim
		    		inteiro impressoesBoletim = 0
		    		
		    		escreva ("\nDeseja solicitar impressãoo do boletim? Digite S/N: ")
		    		leia(imprimirBoletim)
		    		escreva("\nBOLETIM\n")
	    		
		    		se(imprimirBoletim == 'S' e impressoesBoletim < 4){
		    			impressoesBoletim++
		    			para(inteiro i = 0; i < indice; i++){
		    				se(movimentos[i] == 'I'){
		    					escreva("Inclusãoo de nota: ")
		    					escreva(pontos[i], "\n")
		    				}
		    				senao{
		    					escreva("Retirada de nota: ")
		    					escreva(pontos[i], "\n")
		    				}
		    			}
		    			
		    		}
		    		senao{
		    			escreva("Você ultrapassou o limite de emissões por mês")
		    			impressoesBoletim = 0
		    		}
				
			}
			senao se (tipo =='3'){
				limpa()
				escreva ("Escola ED++")
				escreva ("\n,um plus de ensino em sua vida\n")
				escreva("\nGRADUAÇÃO")

				dadosEstudante()
				
				escreva("Status: Digite 1 (Ativa) ou 2 (Inativa): ")
				leia(status)
			}
			senao se (tipo =='4'){
				limpa()
				escreva ("Escola ED++")
				escreva ("\n,um plus de ensino em sua vida\n")
				escreva("\nPÓS GRADUAÇÃO")

				dadosEstudante()
				
				escreva("Status: Digite 1 (Ativa) ou 2 (Inativa): ")
				leia(status)
			}
			senao se (tipo =='5'){
				limpa()
				escreva ("Escola ED++")
				escreva ("\n,um plus de ensino em sua vida\n")
				escreva("\nMESTRADO")

				dadosEstudante()
				
				escreva("Status: Digite 1 (Ativa) ou 2 (Inativa): ")
				leia(status)
			}
		} enquanto (tipo!='6')

		escreva("Fim do programa!!")
	}

	funcao dadosEstudante(){
		inteiro matricula
		cadeia cpf
				
		escreva("\n\nMatrícula: ")
		leia(matricula)
		escreva("CPF: ")
		leia(cpf)
	}

	funcao real notas(caracter status){
		inteiro indice = 0 
		caracter movimentos
		real notaAtual = 0.0
		real pontos[10]
		
		caracter continuar = 'S'
		se(status == '1'){
			enquanto (continuar != 'N'){
				se(indice < 10){
					escreva ("\nTotal atual: ", notaAtual,"\n")
					escreva("MOVIMENTO ", indice + 1," - Digite I (inclusão de nota) ou R (retirada nota): ")
					leia (movimentos)
					escreva("Valor movimento: ")
					leia (pontos[indice])
					    		
					se(movimentos  == 'I'){
				    		notaAtual=+ pontos[indice]
				    	}
				    	senao{
				    		notaAtual=-pontos[indice]
				    	}
				    		indice++	

				    		escreva("Continuar? Digite S (Sim) ou N (Não): ")
				    		leia (continuar)
					}		
				senao{
					escreva("\n NÃO É POSSÍVEL INCLUIR OU RETIRAR NOTAS\n")
					continuar = 'N'
				}
			}
		}
		retorne notaAtual
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 4588; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */