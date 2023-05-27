# prazoMedioEstocagem
O prazo médio de estocagem, como falamos, é o tempo em que o estoque permanece na empresa. Ou seja, é o intervalo necessário para que a empresa seja capaz de comercializar os itens em estoque.

```
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
