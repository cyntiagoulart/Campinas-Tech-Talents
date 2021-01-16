package dia_12012021;

/* Escreva um algoritmo que armazene o valor 99 em uma vari�vel Y e o 
 * valor 11 em uma vari�vel Z. A seguir (utilizando apenas atribui��es 
 * entre vari�veis) troque os seus conte�dos fazendo com que o valor 
 * que est� em Y passe para Z e vice-versa. Ao final, escrever os valores 
 * que ficaram armazenados nas vari�veis.
 */

public class TrocaValores {

	public static void main(String args[]) {
		
		int y = 99;
		int z = 11;
		int troca = 0;
		
		System.out.println("*** ANTES DA TROCA ***");
		System.out.println(" ");
		System.out.println("O valor inicial da minha vari�vel Y �: " + y);
		System.out.println("O valor inicial da minha vari�vel Z �: " + z);
		System.out.println(" ");
		
		
		troca = y;	
		y = z;
		z = troca;
		
		System.out.println("*** DEPOIS DA TROCA ***");
		System.out.println(" ");
		System.out.println("O valor depois da troca da minha vari�vel Y �: " + y);
		System.out.println("O valor depois da troca da minha vari�vel Z �: " + z);
	}	
}
