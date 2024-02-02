package com.polimorfismo.v0;

public class Guitarra extends InstrumentoCuerda{

    public Guitarra(String marca, int noCuerdas, String color, double precio) {
        super(marca, noCuerdas, color, precio);
    }

    @Override
    public void tipo() {
        System.out.println("La guitarra es un instrumento de tipo: Instrumento de cuerda");
    }

    @Override
    public void color() {
        System.out.println("El color de la guitarra es: " + getColor());
    }

    @Override
    public double precio() {
        return 0;
    }
}
