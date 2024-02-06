import java.util.Scanner;

public class AlunosNotas {
    /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author José do Bomfim Truta Neto - 123110810
    */
	
	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
	        String entrada = sc.nextLine();
	        int maior = 0;
	        int menor = 1000;
	        int somatorio = 0;
	        int acima = 0;
	        int abaixo = 0;		
        
	        while (!(entrada.equals("-"))) {
	            String[] alunoNota = entrada.split(" ");
			    String notaStr = alunoNota[1];
	            int nota = Integer.parseInt(notaStr);
	            
	            if (nota > maior) {
	                maior = nota;            
	            }
	            
	            if (nota < menor) {
	                menor = nota;
	            }
	            
	            if (nota >= 700) {
	                acima += 1;            
	            } else {
	                abaixo += 1;    
	            }
	            
	            somatorio += nota;
	            entrada = sc.nextLine();
	        }
	        
	        int media = somatorio/(acima + abaixo);
	        
	        System.out.println("maior: " + maior);
	        System.out.println("menor: " + menor);
	        System.out.println("media: " + media);
	        System.out.println("acima: " + acima);
	        System.out.println("abaixo: " + abaixo);
	
	        sc.close();
	}
}
