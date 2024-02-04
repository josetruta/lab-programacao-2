import java.util.Locale;
import java.util.Scanner;

public class PassouOuNao {

    /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author José do Bomfim Truta Neto - 123110810
    */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextFloat();
        double y = sc.nextFloat();

        double media = (x + y)/2;

        if (media >= 7.0) {
            System.out.println("pass: True!");
        } else {
            System.out.println("pass: False!");
        }

        sc.close();

    }
    
}
