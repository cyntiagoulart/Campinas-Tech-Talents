package dia_12012021;

import java.util.Scanner;

/* Escreva um algoritmo para ler as dimensões de um retângulo 
 * (base e altura), calcular e escrever a área do retângulo.
 */

public class AreaDoRetangulo {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Esse algoritimo calcula a área de um retângulo");
		System.out.println("");
		System.out.println("Por favor digite a base do retângulo: ");
		double base = entrada.nextDouble();

		System.out.println("Por favor digite a altura do retângulo: ");
		double altura = entrada.nextDouble();

		double area = base * altura;

		System.out.println("A área do retângulo é: " + area);

		entrada.close();
	}

}
