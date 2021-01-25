package avaliacaoSemanas1E2.anderson;

import java.util.Scanner;

/* Escreva um programa que receba como entrada o número do mês (1, 2, ..., 12) 
 * e o ano (0, ..., 2xxx), e devolva para o usuário a quantidade de dias que 
 * tem aquele mês. Dica: preste atenção com anos bissextos.
 */

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número para verificar se é primo: ");
		int numeroDigitado = scanner.nextInt();

		int contador = 0;

		if (numeroDigitado < 2) {
			System.out.println("Número inválido!");
		} else {
			for (int i = 1; i <= numeroDigitado; i++) {
				if ((numeroDigitado % i) == 0) {
					contador++;
				}
			}
			if (contador == 2) {
				System.out.println("O número " + numeroDigitado + " é primo!");
			} else {
				System.out.println("O número " + numeroDigitado + " não é primo!");
			}

		}

		scanner.close();

	}

}
