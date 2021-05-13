package classes;

public class Basico extends Estudante { //estudante é a super de básico, mãe de básico

		private int diaAniversario;

		//construtor
		public Basico(int matricula, String cpf, int diaAniversario) {
			super(matricula, cpf);
			this.diaAniversario = diaAniversario;
		}

		public Basico(int matricula, String cpf, boolean status, int diaAniversario) {
			super(matricula, cpf, status);
			this.diaAniversario = diaAniversario;
		}

		//getters
		public int getDiaAniversario() {
			return diaAniversario;
		}

		public void setDiaAniversario(int diaAniversario) {
			this.diaAniversario = diaAniversario;
		}
		
		public void bonusAniversario(int dia) {
			if (diaAniversario == dia){	
				super.adicionarNota((super.getPontos()*0.1));
		}
		}
}