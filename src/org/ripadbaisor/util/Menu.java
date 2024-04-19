package org.ripadbaisor.util;

import javax.swing.JOptionPane;

public class Menu {
    public static String mostrarMenuPrincipal() {
        String opcion = JOptionPane.showInputDialog("""
                       Elija una opción:
                    1. Añadir Restaurante
                    2. Editar Restaurante
                    3. Mostrar Restaurantes
                    4. Eliminar Restaurante
                    Q. Salir del programa
                """);

        return opcion;

    }
}
