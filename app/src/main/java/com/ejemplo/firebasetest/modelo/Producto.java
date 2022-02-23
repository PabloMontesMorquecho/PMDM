package com.ejemplo.firebasetest.modelo;

public class Producto {
    String id, localización, nombre;
    Precio precio;

    public Producto() {
    }

    public Producto(String id, String localización, String nombre, Precio precio) {
        this.id = id;
        this.localización = localización;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocalización() {
        return localización;
    }

    public void setLocalización(String localización) {
        this.localización = localización;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Precio getPrecio() {
        return precio;
    }

    public void setPrecio(Precio precio) {
        this.precio = precio;
    }
}
