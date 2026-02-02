import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int resultado = suma(15,52);
        int resultado2 = suma(15,52,10);
        System.out.println(resultado);
        System.out.printf("resultado: %d\n", resultado2);
        System.out.println(suma());

    }

    /**
     * si usamos return no podemos usar void porque significa que no vamos a retornar nada
     * reemplazamos void por el tipo de dato qye va a retornar el metodo
     */
    static int suma(int a, int b) {
        return a+b;
    }

    // se puede sobreescribir el mismo metodo con el mismo nombre, pero cambiamos los parámetros
    static int suma(int a, int b, int c) {
        return a+b+c;
    }

    static String suma() {
        return "Hola mundo";
    }
}