package dia_13012021;

import java.util.Scanner;

/*Elabore um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:

Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos

*/

public class CategoriaDoNadador {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite quantos anos você tem: ");
		int idade = scanner.nextInt();

		if (idade >= 1 && idade <= 4) {
			System.out.println("Você não tem idade suficiente.");
		} else if (idade >= 5 && idade <= 7) {
			System.out.println("Você pertence a categoria Infantil A.");
		} else if (idade >= 8 && idade <= 11) {
			System.out.println("Você pertence a categoria Infantil B.");
		} else if (idade >= 12 && idade <= 13) {
			System.out.println("Você pertence a categoria Juvenil A.");
		} else if (idade >= 14 && idade <= 17) {
			System.out.println("Você pertence a categoria Juvenil B.");
		} else {
			System.out.println("Você pertence a categoria Adultos.");
		}
		scanner.close();
	}

}
