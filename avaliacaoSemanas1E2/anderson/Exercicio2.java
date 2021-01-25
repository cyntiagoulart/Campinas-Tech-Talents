package avaliacaoSemanas1E2.anderson;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um n�mero de 1 a 7: ");
		int numeroDigitado = scanner.nextInt();

		if (numeroDigitado <= 0 || numeroDigitado >= 7) {
			;
			System.out.println("Este n�o � um n�mero v�lido!");
		} else {
			switch (numeroDigitado) {
			case 1:
				System.out.println("Segunda");
				break;
			case 2:
				System.out.println("Ter�a");
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
				System.out.println("S�bado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			}
		}

		scanner.close();
	}
}