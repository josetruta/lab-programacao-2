import java.util.Scanner;

public class Wally {
	/**
	 * Laboratório de Programação 2 - Lab 1
 	* 
 	* @author José do Bomfim Truta Neto - 123110810
 	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();		
        
        while (!(entrada.equals("wally"))) {
            String[] nomes = entrada.split(" ");
		    String novoNome = "?";

		    for (int i = 0; i < nomes.length; i++) {
			    if (nomes[i].length() == 5) {
				    novoNome = nomes[i];
                }
            }
 
            System.out.println(novoNome);
            entrada = sc.nextLine();
        }
        
        sc.close();
	
	}
}
