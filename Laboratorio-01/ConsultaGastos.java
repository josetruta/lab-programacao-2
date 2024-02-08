import java.util.Scanner;

public class ConsultaGastos {
	
	/**
 	* Laboratório de Programação 2 - Lab 1
 	*
 	* @author José do Bomfim Truta Neto - 123110810
 	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] meses = sc.nextLine().split(" ");
		String[] gastos = sc.nextLine().split(" ");
		String token = sc.nextLine();

		for (int i = 0; i < meses.length; i++) {
			if (meses[i].equals(token)) {
				System.out.println(gastos[i]);
			}
		}
		sc.close();
	}
}
