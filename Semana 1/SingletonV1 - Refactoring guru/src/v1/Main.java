package v1;

public class Main {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons where created (booo!)" + "\n\n" +
                "RESULT:" + "\n");

        // Se crea una instancia de Singleton y se le manda "FOO"
        Singleton singleton = Singleton.getInstance("FOO");
        // Se crea otra instancia de Singleton y se le manda "BAR"
        Singleton anotherSingleton = Singleton.getInstance("BAR");

        // Se imprimen los valores que se mandaron a Singleton
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);

        /*
        * En consola se imprimira:
        *
        * FOO
        * FOO
        *
        * Ya que el valor de referencia que se mando primero a Singleton fue "FOO"
        * */
    }
}

