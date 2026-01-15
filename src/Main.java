import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // ARGUMENTOS PARA CREAR UN ARRAY
        // tipo de dato que se va a almacenar
        // [] =
        // new
        // tipo de dato
        // [longitud que tendrá el array]
        int [] numeros = new int [10];

        // colocar valores directamente
        int [] nums = {2,4,6,8,10};

        // agregar elementos al array
        // poner la posicion o indice donde se va a colocar el elemento nuevo y luego poner el elemento
        numeros[0] = 2;
        numeros[5] = 7;


        // usar el metodo toSTring de la clase Array para inicializar o mostrar el array
        System.out.println(Arrays.toString(numeros));

        // longitud del array
        System.out.println(numeros.length);

        // ordenar un array
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));

        System.out.println(Arrays.toString(nums));
    }
}