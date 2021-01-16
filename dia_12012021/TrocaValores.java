package dia_12012021;

/* Escreva um algoritmo que armazene o valor 99 em uma variável Y e o 
 * valor 11 em uma variável Z. A seguir (utilizando apenas atribuições 
 * entre variáveis) troque os seus conteúdos fazendo com que o valor 
 * que está em Y passe para Z e vice-versa. Ao final, escrever os valores 
 * que ficaram armazenados nas variáveis.
 */

public class TrocaValores {

	public static void main(String args[]) {
		
		int y = 99;
		int z = 11;
		int troca = 0;
		
		System.out.println("*** ANTES DA TROCA ***");
		System.out.println(" ");
		System.out.println("O valor inicial da minha variável Y é: " + y);
		System.out.println("O valor inicial da minha variável Z é: " + z);
		System.out.println(" ");
		
		
		troca = y;	
		y = z;
		z = troca;
		
		System.out.println("*** DEPOIS DA TROCA ***");
		System.out.println(" ");
		System.out.println("O valor depois da troca da minha variável Y é: " + y);
		System.out.println("O valor depois da troca da minha variável Z é: " + z);
	}	
}
