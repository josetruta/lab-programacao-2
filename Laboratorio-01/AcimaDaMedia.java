import java.util.Scanner;

public class AcimaDaMedia {
	
	/**
	 * Laboratório de Programação 2 - Lab 1
 	* 
 	* @author José do Bomfim Truta Neto - 123110810
 	*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada = sc.nextLine();
        	String[] numeros = entrada.split(" ");
		double somatorio = 0;
        
        	for (int i = 0; i < numeros.length; i++) { 
            		somatorio = somatorio + Integer.parseInt(numeros[i]);
        	}
        
        	double media = somatorio / numeros.length;

        	int item = 0;        
        	for (int i = 0; i < numeros.length; i++) {
            		item = Integer.parseInt(numeros[i]);            
            		if (item > media) {
                		System.out.printf("%d ", item);            
            		}        
        	}
        
        	System.out.println();
        	sc.close();
		
	}
}
