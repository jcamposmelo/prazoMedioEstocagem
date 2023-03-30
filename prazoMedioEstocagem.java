public class prazoMedioEstocagem {
	public static void main(String[] args) {
		double estoque = 14289000;
		double cmv = 63130000;

		double prazoMedioEstocagem;

		prazoMedioEstocagem = (estoque / cmv)*360;

		System.out.println("O Prazo Médio de Estocagem é?  " + 
				prazoMedioEstocagem + " dias ");
	}

}