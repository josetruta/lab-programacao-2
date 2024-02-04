import java.util.Scanner;

public class FuncaoMonotona {

    /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author José do Bomfim Truta Neto - 123110810
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z, w;

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        w = sc.nextInt();

        if (x < y && y < z && z < w) {
            System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
        } else if (x > y && y > z && z > w) {
            System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
        } else {
            System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
        }
        
        sc.close();
    }    
    
    
}
