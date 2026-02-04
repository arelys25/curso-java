public class User {
    double id  = Math.random(); // valor aleatorio
    String name;

    public User(String name){
        this.name = name;
    }

    public void saludar(){
        // this es para hacer referencia a la misma clase
        System.out.println("Hola mundo, soy "+this.name);
    }

}
