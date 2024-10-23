package com.example.pizza_login.Entidad;

public class Pizza {
    String Usuario;
    String Direccion;
    String Tamaño;
    Ingredientes i;

    public Pizza(String usuario, String direccion, String tamaño, Ingredientes i) {
        Usuario = usuario;
        Direccion = direccion;
        Tamaño = tamaño;
        this.i = i;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String tamaño) {
        Tamaño = tamaño;
    }

    public Ingredientes getI() {
        return i;
    }

    public void setI(Ingredientes i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "Usuario='" + Usuario + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Tamaño='" + Tamaño + '\'' +
                ", i=" + i +
                '}';
    }
}
