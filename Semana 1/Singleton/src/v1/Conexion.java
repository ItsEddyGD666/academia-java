package v1;

public class Conexion {

    private static Conexion conn = new Conexion("MySQL");
    String bd;
    static int contador;

    private Conexion(String bd) {
        //this.bd = bd;
        ++contador;
    }

    public static Conexion getInstance() {
        return conn;
    }

}
