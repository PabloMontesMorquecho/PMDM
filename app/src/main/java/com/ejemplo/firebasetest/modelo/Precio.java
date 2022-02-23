package com.ejemplo.firebasetest.modelo;

public class Precio {
    String moneda, unidad;
    String valor;

    public Precio() {}

    public Precio(String moneda, String unidad, String valor) {
        this.moneda = moneda;
        this.unidad = unidad;
        this.valor = valor;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
