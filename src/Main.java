import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // si queremos utilizar el metodo dentro de un metodo static (psvm) el metodo también tendrá que ser static
    static void miMetodo(String nombre, int edad) { // parametros
        System.out.println("Hola "+nombre + "\nTu edad es: " + edad);
    }

    public static void main(String[] args) {
        // ejecutar el metodo

        miMetodo("Arely",20); // argumentos
        miMetodo("Alexis",24);


    }
}