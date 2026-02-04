import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        // crear una instancia de la clase
        User user = new User("Arely");


        User user2 = new User("Alexis");

        user.saludar();
        user2.saludar();

        // variable static que no se puede cambiar su valor, solo se accede a ella desde la misma clase
        System.out.println(User.tableName);

    }


}