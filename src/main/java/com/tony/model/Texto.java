package com.tony.model;

public class Texto {

    private String texto;

    public Texto(String texto) {
        this.texto = texto;

    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String pasarAMayusculas() {
        return texto.toUpperCase();
    }

    public String pasarAMinusculas() {
        return texto.toLowerCase();
    }

    public String pasarPrimeraMayusculas() {
        return texto.substring(0, 1).toUpperCase() + texto.substring(1);
    }

    public String modoOracion() {
        return null;
    }
}