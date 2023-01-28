package com.plecca.proy6;

public class Prueba {
    private int id;
    private String  pruebaClase;

    public Prueba(int id, String pruebaClase) {
        this.id = id;
        this.pruebaClase = pruebaClase;
    }

    public Prueba(String pruebaClase) {
        this.pruebaClase = pruebaClase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPruebaClase() {
        return pruebaClase;
    }

    public void setPruebaClase(String pruebaClase) {
        this.pruebaClase = pruebaClase;
    }
}
