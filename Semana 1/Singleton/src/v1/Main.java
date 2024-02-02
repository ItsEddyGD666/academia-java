package v1;

/*
Singleton es un patron de diseño creacional que nos permite asegurarnos que una
clase tenga una unica instancia, a la vez que proporciona un punto de acceso global
a dicha distancia
*/

public class Main {
    public static void main(String[] args) {
        Conexion conn = Conexion.getInstance();
        Cliente cliente1 = new Cliente("Patrobas", conn);
        Cliente cliente2 = new Cliente("Andronico", conn);

        Conexion conn2 = Conexion.getInstance();
        Cliente cliente3 = new Cliente("Patrobas", conn2);

        System.out.println(cliente1.conn);

        System.out.println(cliente1.conn == cliente3.conn);
        System.out.println(Conexion.contador);
    }
}