package org.ripadbaisor.util;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.ripadbaisor.hosteleria.Restaurante;

public class Validador {

    public static boolean validarDato(String dato) {

        if (!dato.isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null,
                    "ES OBLIGATORIO INTRODUCIR LA INFORMACIÓN");
            return false;
        }

    }

    public static float recibirPuntuacion() {

        while (true) {
            String nuevaPuntuacion = JOptionPane.showInputDialog("Ingrese la puntuación del restaurante: ");
            try {
                float puntuacion = Float.parseFloat(nuevaPuntuacion);
                if (puntuacion >= 0 && puntuacion <= 5) {
                    return puntuacion;
                } else {
                    JOptionPane.showMessageDialog(null, "La puntuación debe estar entre 0 y 5.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "La puntuación debe ser un número.");
            }
        }

    }

    public static int recibirIndice(ArrayList<Restaurante> restaurantes) {

        while (true) {
            try {
                String numeroRestaurante = JOptionPane.showInputDialog("Ingrese el número del restaurante:");
                int indice = Integer.parseInt(numeroRestaurante) - 1;
                if (indice >= 0 && indice < restaurantes.size()) {
                    return indice;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Número de restaurante inválido. Debe ser entre 1 y " + restaurantes.size());
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El número debe ser un número entero.");
            }
        }

    }
}
