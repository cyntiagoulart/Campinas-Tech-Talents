package avaliacaoSemanas1E2.anderson;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número de 1 a 7: ");
		int numeroDigitado = scanner.nextInt();

		if (numeroDigitado <= 0 || numeroDigitado >= 7) {
			;
			System.out.println("Este não é um número válido!");
		} else {
			switch (numeroDigitado) {
			case 1:
				System.out.println("Segunda");
				break;
			case 2:
				System.out.println("Terça");
				break;
			case 3:
				System.out.println("Quarta");
				break;
			case 4:
				System.out.println("Quinta");
				break;
			case 5:
				System.out.println("Sexta");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			}
		}

		scanner.close();
	}
}