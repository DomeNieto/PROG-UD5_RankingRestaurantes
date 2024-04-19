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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocacion() {
        return locacion;
    }
    
    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(float puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Número de Restaurante\n" + "Restaurante: " + nombre + "\n"
                + "Localización: " + locacion + "\n"
                + "Horario: " + horario + "\n"
                + "Puntuación: " + puntuacion
                + "\n";
    }

}
