package dia_12012021;

import java.util.Scanner;

/* Escreva um algoritmo para ler as dimens�es de um ret�ngulo 
 * (base e altura), calcular e escrever a �rea do ret�ngulo.
 */

public class AreaDoRetangulo {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Esse algoritimo calcula a �rea de um ret�ngulo");
		System.out.println("");
		System.out.println("Por favor digite a base do ret�ngulo: ");
		double base = entrada.nextDouble();

		System.out.println("Por favor digite a altura do ret�ngulo: ");
		double altura = entrada.nextDouble();

		double area = base * altura;

		System.out.println("A �rea do ret�ngulo �: " + area);

		entrada.close();
	}

}
