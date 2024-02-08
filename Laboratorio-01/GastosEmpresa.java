import java.util.Scanner;

public class GastosEmpresa {
	
	/**
	 * Laboratório de Programação 2 - Lab 1
 	*
 	* @author José do Bomfim Truta Neto - 123110810
 	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] numeros = sc.nextLine().split(" ");
		int maior1 = 0;
		int maior2 = 0;
		int num;

		for (String item : numeros) {
			num = Integer.parseInt(item);

			if (num > maior1) {
				maior2 = maior1;
				maior1 = num;
			} else if (num > maior2) {
				maior2 = num;
			}
		}

		System.out.println(maior1 + maior2);
		sc.close();

	}
}
