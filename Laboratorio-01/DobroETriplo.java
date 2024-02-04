import java.util.Scanner;

public class DobroETriplo {

    /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author José do Bomfim Truta Neto - 123110810
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int dobro = x * 2;
        int triplo = x * 3;

        System.out.printf("dobro: %d, triplo: %d%n", dobro, triplo);
        sc.close();
    }
    
}
