import java.util.Scanner;

public class AlturaAviao {

	/**
 	* Laboratório de Programação 2 - Lab 1
 	* 
	* @author José do Bomfim Truta Neto - 123110810
 	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ideal = sc.nextInt();
		int atual = sc.nextInt();
		int diffIdeal = Math.abs(ideal - atual);
		int diffAtual;
		
		while (!(diffIdeal == 0)) {
			
			atual = sc.nextInt();
			diffAtual = Math.abs(ideal - atual);

			if (diffAtual == 0) {
				break;
			} else if (diffAtual < diffIdeal) {
				System.out.println("ADEQUADO");
			} else {
				System.out.println("PERIGO");
			}

			diffIdeal = diffAtual;
			
		}

		System.out.println("OK");
		sc.close();
	}
}
