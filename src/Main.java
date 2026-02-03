import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String input = "";

       // se le asigna un nombre al bucle para ayudar al break del caso 3 y que sepa que va a terminar el buble
        // y no solo el switch case
       terminal: while (true) {

           mostrarOpciones();
           input = sc.next().toLowerCase(); // leer la siguiente linea y hacela toda minuscula

           switch (input) {
               case "1":
                   int resultado = calculadora(sc);
                   System.out.println("Resultado " + resultado);
                   break;
               case "2":
                   hackearNasa();
                   break;
               case "3":
                   System.out.println("Adios");
                   break terminal; // aqui se usa el nombre asignado al bucle para terminar el bucle
           }

       }
    }

    static void mostrarOpciones(){
        System.out.println("Ingresa opción:");
        System.out.println("1. Calculadora");
        System.out.println("2. Hackeando la nasa");
        System.out.println("3. Salir");
    }

    static void hackearNasa(){
        System.out.println("#");
        System.out.println("##");
        System.out.println("###");
    }

    static int calculadora(Scanner sc){
        System.out.println("Introduce el primer número:");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo número:");
        int b = sc.nextInt();

        return a+b;
    }

}