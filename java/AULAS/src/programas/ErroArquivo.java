package programas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ErroArquivo {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\temp\\list.txt");
		Scanner leia = null;
		try {
			leia = new Scanner (arquivo);
			while (leia.hasNextLine()){
				System.out.println(leia.hasNextLine());
			}
		} catch ( IOException erro) {
			System.out.println("Erro na abertua do arquivo");
			
		}
		finally {
			if (leia !=null) {
				leia.close();
			}
		}
	}

}
