package dia_16012021;

public class Invertida {

	public static void main(String args[]) {

		String paraInverter = "Eu tinha uma galinha que se chamava Marylou.";
		String invertida = new StringBuilder(paraInverter).reverse().toString();

		System.out.println(invertida);
		
	}

}
