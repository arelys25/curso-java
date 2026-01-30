import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // ARRAY DE ARRAYS, es como hacer una matriz [][] significa que es un array de arrays
        int[][] numeros = {{0,1}, {3,4}};

        // forma de inicializar un array de arrays si no sabemos su logitud
        int [][] num = new int [3][2];
        num [0][0] = 5;
        num [2][1] = 10;

        // array de 3 dimensiones
        int [][][] num2 = new int [3][2][4];
        num2 [0][0][2] = 5;
        num2 [2][1][3] = 10;

        // imprimir un array normal
        //System.out.println(Arrays.toString(numeros));

        // imprimir un array de arrays
        System.out.println(Arrays.deepToString(numeros));

        System.out.println(Arrays.deepToString(num));

        System.out.println(Arrays.deepToString(num2));

    }
}