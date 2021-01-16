package dia_12012021;

/* Escreva um algoritmo para ler um valor (do teclado) e escrever 
 * (na tela) o seu antecessor.
 */

import java.util.Scanner;

public class Antecessor {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escreva um número inteiro: ");
		int num = entrada.nextInt();

		System.out.println("");
		System.out.println("Você inseriu um integer de valor :" + num);
		System.out.println("O seu antecessor é :" + (num - 1));

		entrada.close();

	}

}
