
import java.util.Scanner;
	
public class projetoEscola {
	public static void main(String[] args) {
		
		
		Scanner leia= new Scanner(System.in);
		char creditoMestrado;
		int pontoCredito = 0;
		int notaAtual = 0;
		 
		
			System.out.println("Você possui algum crédito? Responda com sim ou não: "); 
			creditoMestrado = leia.next().toUpperCase().charAt(0);

						if (creditoMestrado == 'S')
						{
							System.out.println("Digite o valor do seu crédito entre 0 e 10: ");
							pontoCredito = leia.nextInt();
						}
						
						if ( pontoCredito != 0 ){
								notaAtual = pontoCredito + notaAtual;
								System.out.printf("\nO total de pontos do estudante é %d. \n",notaAtual);
							}
						else
							{
							System.out.printf("\nO total de pontos do estudante é %d. \n",notaAtual);
							}
							}	
	}



