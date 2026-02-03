import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String input = "";

       while (!input.equals("salir")) {
           System.out.println("Ingresa comando:");
           input = sc.next().toLowerCase(); // leer la siguiente linea y hacela toda minuscula
           System.out.println("Su respuesta fue: "+input);

       }

        System.out.println("Adiós");
    }

}