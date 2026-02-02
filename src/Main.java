import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // si queremos utilizar el metodo dentro de un metodo static (psvm) el metodo también tendrá que ser static
    static void miMetodo(){
        System.out.println("Hola mundo");

    }

    static void otroMetodo(){
        System.out.println("Adios método");
    }

    public static void main(String[] args) {
        // ejecutar el metodo
        miMetodo();
        otroMetodo();
    }
}