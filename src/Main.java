//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // colocar comillas dobles sin que sea error con '\' antes del simbolo
        String text = "Hola \"mundo\"";

        // simular si queremos imprimir una ruta de un directorio igual con '\'
        String ruta_directorio = "C:\\Escritorio\\Cursos";

        // colocar texto en el siguiente renglón
        String text2 = "Hola \nmundo";

        // hacer un tab a un texto
        String text3 = "Hola \tmundo";


        System.out.println(text);
        System.out.println(ruta_directorio);
        System.out.println(text2);
        System.out.println(text3);
    }
}