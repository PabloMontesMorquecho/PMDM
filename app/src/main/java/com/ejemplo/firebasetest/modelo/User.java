package com.ejemplo.firebasetest.modelo;

public class User {
    boolean autonomo;
    String email, nombre;

    public User() {}

    public User(boolean autonomo, String email, String nombre) {
        this.autonomo = autonomo;
        this.email = email;
        this.nombre = nombre;
    }

    public boolean isAutonomo() {
        return autonomo;
    }

    public void setAutonomo(boolean autonomo) {
        this.autonomo = autonomo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
