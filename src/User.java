public class User {
    double id  = Math.random(); // valor aleatorio
    String name;

    public void saludar(){
        // this es para hacer referencia a la misma clase
        System.out.println("Hola mundo, soy "+this.name);
    }

}
