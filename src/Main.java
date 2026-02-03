import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        int r = suma(new int[]{1,2,3,4,5});
        System.out.println(r);
    }

    static int suma(int [] numeros){
        int resultado = 0;
        for(int numero : numeros){
            resultado += numero;
        }
        return resultado;
    }
}