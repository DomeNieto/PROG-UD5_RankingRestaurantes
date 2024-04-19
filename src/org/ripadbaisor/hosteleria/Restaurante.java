package org.ripadbaisor.hosteleria;

public class Restaurante {

    private String nombre;
    private String locacion;
    private String horario;
    private float puntuacion;

    public Restaurante() {
    }

    public Restaurante(String nombre, String locacion, String horario, float puntuacion) {
        this.nombre = nombre;
        this.locacion = locacion;
        this.horario = horario;
        this.puntuacion = puntuacion;
    }

}
