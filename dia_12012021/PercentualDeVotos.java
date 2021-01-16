package dia_12012021;

import java.util.Scanner;

/* Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, 
 * o n�mero de votos brancos, nulos e v�lidos. Calcular e escrever o percentual 
 * que cada um representa em rela��o ao total de eleitores..
 */

public class PercentualDeVotos {

	public static double calculaPercentual(double totalDeEleitores, double total) {

		double percentual = total * 100 / totalDeEleitores;
		return percentual;

	}

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o total de votos: ");
		double totalVotos = scanner.nextDouble();
		System.out.println("Digite o total de votos em branco: ");
		double totalVotosBrancos = scanner.nextDouble();
		System.out.println("Digite o total de votos nulos: ");
		double totalVotosNulos = scanner.nextDouble();
		System.out.println("Digite o total de votos v�lidos: ");
		double totalVotosValidos = scanner.nextDouble();

		System.out.println("A quantidade total de votos �: " + totalVotos);

		System.out.println("A quantidade total de votos em branco �: " + totalVotosBrancos);

		System.out.println("A quantidade total de votos nulos �: " + totalVotosNulos);

		System.out.println("A quantidade total de votos validos �: " + totalVotosValidos);

		double percentualVotosBrancos = calculaPercentual(totalVotos, totalVotosBrancos);

		double percentualVotosNulos = calculaPercentual(totalVotos, totalVotosNulos);

		double percentualVotosValidos = calculaPercentual(totalVotos, totalVotosValidos);

		System.out.println("-----------");

		System.out.println("O percentual total de votos em branco �: " + String.format("%.2f", percentualVotosBrancos));

		System.out.println("O percentual total de votos nulos �: " + String.format("%.2f", percentualVotosNulos));

		System.out.println("O percentual total de votos validos �: " + String.format("%.2f", percentualVotosValidos));

		scanner.close();

	}

}
