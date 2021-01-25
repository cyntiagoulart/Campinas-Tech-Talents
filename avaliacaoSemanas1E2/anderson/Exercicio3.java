package avaliacaoSemanas1E2.anderson;

import java.util.Scanner;

/* Escreva um programa que receba como entrada o n�mero do m�s (1, 2, ..., 12) 
 * e o ano (0, ..., 2xxx), e devolva para o usu�rio a quantidade de dias que 
 * tem aquele m�s. Dica: preste aten��o com anos bissextos.
 */

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um n�mero para verificar se � primo: ");
		int numeroDigitado = scanner.nextInt();

		int contador = 0;

		if (numeroDigitado < 2) {
			System.out.println("N�mero inv�lido!");
		} else {
			for (int i = 1; i <= numeroDigitado; i++) {
				if ((numeroDigitado % i) == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				System.out.println("O n�mero " + numeroDigitado + " � primo!");
			} else {
				System.out.println("O n�mero " + numeroDigitado + " n�o � primo!");
			}

		}

		scanner.close();

	}

}
