package com.polimorfismo.v0;

public abstract class InstrumentoCuerda implements InstrumentoMusical {
    private String marca;
    private int noCuerdas;
    private String color;
    private double precio;

    public InstrumentoCuerda(String nombre, int noCuerdas, String color, double precio) {
        this.marca = nombre;
        this.noCuerdas = noCuerdas;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNoCuerdas() {
        return noCuerdas;
    }

    public void setNoCuerdas(int noCuerdas) {
        this.noCuerdas = noCuerdas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "InstrumentoCuerda{" +
                "nombre='" + marca + '\'' +
                ", noCuerdas=" + noCuerdas +
                ", color='" + color + '\'' +
                ", precio=" + precio +
                '}';
    }
}
