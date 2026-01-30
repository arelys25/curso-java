import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = 2 + 2;
        int b = 7 - 2;
        int c = 3*3;
        float d = 10f / 3f;
        double e = 10.0 / 3.0;
        int f = 10%5;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        int g = 5;
        int h = g++;
        int i = 5;
        int j = ++i;
        // incrementar el valor de 1 en 1
        System.out.println(h); // si usamos esto, la suma se mostrará porque primero sumamos y luego imprimimos la variable
        System.out.println(j); // aquí primero imprime la variable y luego hace la suma. Solo se ve el valor de la variable sin la suma

        int k = 5;
        // forma larga
        k = k + 10;

        //forma corta
        k += 10;

        k /= 5;
        System.out.println(k);

    }
}