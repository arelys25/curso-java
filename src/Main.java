import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String input = "";

       while (true) {
           System.out.println("Ingresa comando:");
           input = sc.next().toLowerCase(); // leer la siguiente linea y hacela toda minuscula

           if (input.equals("exit")) {
               break; // se sale del bucle e ignora todo lo después de este punto
           }

           if (input.equals("continuar")) {
               continue; // se regresa al inicio del bucle
           }

           System.out.println("Linea de test");

       }

        System.out.println("Adiós");
    }

}