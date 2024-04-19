package org.ripadbaisor.util;

import javax.swing.JOptionPane;

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
}
