package dia_13012021;

import java.util.Scanner;

/*Escreva um algoritmo que leia um n�mero inteiro e diga se ele � par ou �mpar.*/

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro: ");
		int num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " � par!");
		} else {
			System.out.println(num + " � �mpar!");
		}
		scanner.close();
	}

}
