//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "Hola mundo";
        String frase = "Mi nombre es Arely";
        String malo = "    Alexis Israel    ";

        int longitud = text.length();

        // reemplazar una palabra u oracion por otra.
        // primer argumento = palabra que se va a reemplazar
        // segundo argumento = palabra que la va a reemplazar
        String otro_texto = text.replaceAll("mundo", "Arely");

        System.out.println(text);
        System.out.println(longitud);
        System.out.println(otro_texto);

        // metodo que devuelve true o false dependiendo de si se cumple la condicón
        System.out.println(otro_texto+" termina con 'ely'? "+otro_texto.endsWith("ely"));
        System.out.println(otro_texto+" termina con 'undo'? "+otro_texto.endsWith("undo"));

        System.out.println(otro_texto+" inicia con 'Ho'? "+otro_texto.startsWith("Ho"));
        System.out.println(otro_texto+" inicia con 'Are'? "+otro_texto.startsWith("Are"));

        // saber si el string contiene o no una cadena de texto en específico.
        System.out.println(frase.contains("es"));

        // saber en qué parte del texto de encuentra la palabra (devuelve el índice) se puede buscar string o caracter
        System.out.println(frase.indexOf("es"));

        // poner todo el texto en mayúscula
        System.out.println(frase.toUpperCase());
        // poner todo el texto en minúscula
        System.out.println(frase.toLowerCase());

        // quitar los espacios que se encuentran al comienzo y al final de un string
        System.out.println(malo.trim());
        System.out.println(malo);
    }
}