package org.ripadbaisor.hosteleria;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;
import java.util.Comparator;

import org.ripadbaisor.util.Validador;

public class Gestor {

    public static ArrayList<Restaurante> restaurantes = new ArrayList<>();

    public static void agregarRestaurante() {

        String nombre = JOptionPane.showInputDialog(null, "Introduzca el nombre del restaurante que desea almacenar");

        while (!Validador.validarDato(nombre)) {
            nombre = JOptionPane.showInputDialog(null,
                    "Introduzca el nombre del restaurante que desea almacenar");
        }

        String locacion = JOptionPane.showInputDialog(null,
                "Introduzca la locación del restaurante que desea almacenar");

        while (!Validador.validarDato(locacion)) {
            locacion = JOptionPane.showInputDialog(null, "Introduzca la locación del restaurante que desea almacenar");
        }

        String horario = JOptionPane.showInputDialog(null,
                "Introduzca el horario del restaurante que desea almacenar");

        while (!Validador.validarDato(horario)) {
            horario = JOptionPane.showInputDialog(null, "Introduzca el horario del restaurante que desea almacenar");
        }

        float puntuacion = Validador.recibirPuntuacion();

        Restaurante nuevoRestaurante = new Restaurante(nombre, locacion, horario, puntuacion);

        restaurantes.add(nuevoRestaurante);
    }

    public static void mostrarRestaurantes() {

        if (restaurantes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay restaurantes registrados.");
        } else {
            Collections.sort(restaurantes, new Comparator<Restaurante>() {
                @Override
                public int compare(Restaurante primRestaurante, Restaurante segundoRestaurante) {

                    return Float.compare(segundoRestaurante.getPuntuacion(), primRestaurante.getPuntuacion());
                }
            });

            String mensaje = "Lista de restaurantes ordenados por puntuación:\n\n";
            for (int i = 0; i < restaurantes.size(); i++) {
                mensaje += (i + 1) + ". " + restaurantes.get(i).toString() + "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }

    }

}
