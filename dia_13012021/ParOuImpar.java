package dia_13012021;

import java.util.Scanner;

/*Escreva um algoritmo que leia um número inteiro e diga se ele é par ou ímpar.*/

public class ParOuImpar {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		int num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " é par!");
		} else {
			System.out.println(num + " é ímpar!");
		}
		scanner.close();
	}

}
