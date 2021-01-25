package avaliacaoSemanas1E2.anderson;

import java.util.Scanner;

/*
 * Escreva um algoritmo que inverta o conte�do de uma String utilizando uma estrutura de 
 * repeti��o. O usu�rio ir� entrar com o valor de uma string, por exemplo "ASDFG", e o 
 * programa dever� devolver o seguinte resultado "GFDSA". Dicas: Voc� ir� usar os seguinte 
 * m�todos ou atributos:
String.length;
// Para saber o tamanho de uma string
String.charAt(index); 
// Onde index � o �ndice que voc� quer acessar a sting. O ind�ce de uma string come�a sempre 
 * em 0 e termina no tamanho da string -1 (n-1);
char c='S';  
String s=String.valueOf(c);
// Para converter um char em String novamente
 */

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a frase a ser invertida: ");

		String paraInverter = scanner.nextLine();

		String invertido = "";

		for (int i = paraInverter.length() - 1; i >= 0; i--) {
			invertido = invertido + paraInverter.charAt(i);
		}

		System.out.println(invertido);

		scanner.close();
	}
}
