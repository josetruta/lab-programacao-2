import java.util.Scanner;
import java.util.Locale;

public class Calculadora {

    /**
    * Laboratório de Programação 2 - Lab 1
    * 
    * @author José do Bomfim Truta Neto - 123110810
    */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String operacao = sc.nextLine();

        if (!(operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/"))) {
            System.out.println("ENTRADA INVALIDA");

            sc.close();
            System.exit(0);
        }

        double x = sc.nextFloat();
        double y = sc.nextFloat();
        double resultado;

        if (operacao.equals("+")) {
            resultado = x + y;
        } else if (operacao.equals("-")) {
            resultado = x - y;
        } else if (operacao.equals("*")) {
            resultado = x * y;
        } else {
            if (y == 0) {
                System.out.println("ERRO");

                sc.close();
                System.exit(0);
            }
            resultado = x / y;
        }

        System.out.println("RESULTADO: " + resultado);
        sc.close();

    }
    
}
