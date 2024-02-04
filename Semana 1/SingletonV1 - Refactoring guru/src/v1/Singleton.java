package v1;

/*
* Singleton es un patron de diseño creacional que nos permite asegurarnos de que una clase
* tenga una unica instancia, a la vez que proporciona un punto de acceso global a dicha
* instancia
* */

public class Singleton {

    // Atributos de la clase Singleton
    private static Singleton instance;
    public String value;

    /*
    * Una vez llamado este constructor, se crea un hilo con un tiempo de 1seg
    * */
    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    /*
    * Una vez llamado a este metodo, si la referencia es null, se crea un objeto de tipo Singleton y se le pasa
    * un value
    * */
    public static Singleton getInstance(String value) {
        if (instance == null)
            instance = new Singleton(value);
        return instance;
    }
}
