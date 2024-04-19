import javax.swing.JOptionPane;

import org.ripadbaisor.hosteleria.Gestor;
import org.ripadbaisor.util.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        boolean entrar = true;

        while (entrar) {

            String opcion = Menu.mostrarMenuPrincipal();
            if (opcion != null) {
                opcion = opcion.trim().toUpperCase();

                switch (opcion) {
                    case "1":
                        Gestor.agregarRestaurante();
                        break;
                    case "2":
                        Gestor.editarRestaurante();
                        break;
                    case "3":
                        Gestor.mostrarRestaurantes();
                        break;
                    case "4":
                        Gestor.eliminarRestaurante();
                        break;
                    case "Q":
                        JOptionPane.showMessageDialog(null, "Adiós");
                        entrar = false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Selecciona una opción válida.");
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ninguna opción seleccionada. Saliendo del programa.");
                entrar = false;
            }
        }

    }
}
