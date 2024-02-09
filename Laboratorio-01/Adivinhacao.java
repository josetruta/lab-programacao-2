import java.util.Scanner;

public class Adivinhacao {

    /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author José do Bomfim Truta Neto - 123110810
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alvo = sc.nextInt();
        int chute = sc.nextInt();

        while (!(chute == alvo)) {

            if (chute > alvo) {
                System.out.println("MAIOR");
            } else {
                System.out.println("MENOR");
            }
            
            chute = sc.nextInt();

        }

        System.out.println("ACERTOU");
        sc.close();
    }
    
}
