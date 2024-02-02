package v1;

public class Cliente {
    public Cliente(String nombre, Conexion conn) {
        this.nombre = nombre;
        this.conn = conn;
    }

    @Override
    public String toString() {
        return "com.conexion.Cliente{" +
                "nombre='" + nombre + '\'' +
                ", conn=" + conn +
                '}';
    }

    String nombre;
    Conexion conn;

}
