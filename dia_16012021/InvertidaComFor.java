package dia_16012021;

import java.util.Scanner;

public class InvertidaComFor {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a string a ser invertida: ");

		String paraInverter = scanner.nextLine();

		String invertido = "";

		for (int i = paraInverter.length() - 1; i >= 0; i--) {
			invertido = invertido + paraInverter.charAt(i);
		}

		System.out.println(invertido);

		scanner.close();

	}

}
