package org.ripadbaisor.hosteleria;

import java.util.ArrayList;
import javax.swing.JOptionPane;

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

}
