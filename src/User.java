public class User {
    static String tableName = "user"; // static para que no sea modificable la variable, solo se puede acceder
                                        // desde la clase, User.tableName
    double id  = Math.random(); // valor aleatorio
    String name;

    public User(String name){
        this.name = name;
    }

    public void saludar(){
        // this es para hacer referencia a la misma clase
        System.out.println("Hola mundo, soy "+this.name);
        System.out.println(tableName); // no se necesita el this cuando es una variable static
    }

}
