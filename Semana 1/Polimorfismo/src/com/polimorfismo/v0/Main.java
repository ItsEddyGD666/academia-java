package com.polimorfismo.v0;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Guitarra> guitarra = new ArrayList<>();
        guitarra.add(new Guitarra("ESP", 6, "Negro", 1600.0));
        guitarra.add(new Guitarra("Jackson", 7, "Rojo", 1000.0));
        guitarra.add(new Guitarra("Ibanez", 6, "Azul Metalico", 2400.0));
        mostrar(guitarra);
    }

    public static void mostrar(List<Guitarra> guitar) {
        for (Guitarra g : guitar) {
            System.out.println(g);
            System.out.println(g.getMarca());
            System.out.println(g.getPrecio());
            System.out.println();
        }
    }

}
