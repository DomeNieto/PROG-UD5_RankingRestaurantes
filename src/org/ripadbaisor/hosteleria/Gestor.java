package org.ripadbaisor.hosteleria;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Collections;
import java.util.Comparator;

import org.ripadbaisor.util.Menu;
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

    public static void editarRestaurante() {

        if (restaurantes.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay restaurantes registrados para editar.");
        } else {

            mostrarRestaurantes();
            int indice = Validador.recibirIndice(restaurantes);
            if (indice >= 0 && indice < restaurantes.size()) {
                Restaurante restaurante = restaurantes.get(indice);

                String opcionModificar = Menu.mostrarMenuEdicion();

                switch (opcionModificar) {
                    case "1":
                        editarAtributo(restaurante, "nombre");
                        break;
                    case "2":
                        editarAtributo(restaurante, "locacion");
                        break;
                    case "3":
                        editarAtributo(restaurante, "horario");
                        break;
                    case "4":
                        editarAtributo(restaurante, "puntuacion");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida.");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Índice de restaurante inválido.");
            }
        }

    }

    private static void editarAtributo(Restaurante restaurante, String atributo) {

        String nuevoValor = JOptionPane.showInputDialog("Ingrese el nuevo valor para " + atributo + ":");

        if (nuevoValor != null && !nuevoValor.isEmpty()) {
            switch (atributo) {
                case "nombre":
                    restaurante.setNombre(nuevoValor);
                    JOptionPane.showMessageDialog(null, "Nombre del restaurante editado exitosamente.");
                    break;
                case "locacion":
                    restaurante.setLocacion(nuevoValor);
                    JOptionPane.showMessageDialog(null, "Locación del restaurante editada exitosamente.");
                    break;
                case "horario":
                    restaurante.setHorario(nuevoValor);
                    JOptionPane.showMessageDialog(null, "Horario del restaurante editado exitosamente.");
                    break;
                case "puntuacion":
                    float nuevaPuntuacion = Validador.recibirPuntuacion();
                    restaurante.setPuntuacion(nuevaPuntuacion);
                    JOptionPane.showMessageDialog(null, "Puntuación del restaurante editada exitosamente.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Atributo no válido.");

            }

        } else {
            JOptionPane.showMessageDialog(null, "El nuevo valor no puede estar vacío.");
        }

    }

}
