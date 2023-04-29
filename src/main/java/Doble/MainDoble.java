/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doble;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class MainDoble {

    public static void main(String[] args) {
        
        ListaDoble lista = new ListaDoble();
        int opcion = 0;
        String Cancion;
        do {

            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar el nombre de la canción al Inicio\n"
                        + "2. Agregar el nombre de la canción al Final\n"
                        + "3. Llamar canciones\n"
                        + "4. Mostrar la Lista de Inicio a Fin\n"
                        + "5. Mostrar la Lista de Fin a Inicio\n"
                        + "6. Quitar todo menos la ultima\n"
                        + "7. Quitar todo menos la primera\n"
                        + "8. Salir\n"
                        + "\nSelecciona tu opción", "Menu de Opciones", JOptionPane.INFORMATION_MESSAGE));

                switch (opcion) {
                    case 1:
                        Cancion = (JOptionPane.showInputDialog(null,
                                "Ingrese el elemento del Nodo", "Agregando Nodo al Inicio",
                                JOptionPane.INFORMATION_MESSAGE));

                        lista.agregarAlInicio(Cancion);
                        break;

                    case 2:
                        Cancion = (JOptionPane.showInputDialog(null,
                                "Ingrese el elemento del Nodo", "Agregando Nodo al Final",
                                JOptionPane.INFORMATION_MESSAGE));
                        lista.agregarAlFinal(Cancion);
                        break;

                    case 3:

                        archivos a = new archivos();
                        String s1 = a.leerTxt("C:\\Users\\Usuario\\OneDrive\\Escritorio\\Trabajos de U\\quinto ciclo\\PROGRAMACIÓN III\\Music\\Canciones.txt");

                            Cancion = s1;
                        
                        lista.agregarAlFinal(Cancion);
                        break;

                    case 4:
                        if (!lista.estVacia()) {
                            lista.mostrarListaInicioFin();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Nodos aun", "Lista Vacía",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 5:
                        if (!lista.estVacia()) {
                            lista.mostrarListaFinInicio();
                        } else {
                            JOptionPane.showMessageDialog(null, "No hay Nodos aun", "Lista Vacía",
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case 6:
                        Cancion = "";

                        lista.MostrarFin(Cancion);
                        break;

                    case 7:
                        Cancion = "";

                        lista.MostrarInicio(Cancion);
                        break;

                    case 8:
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada", "Fin",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Esta opción no existe", "Intentelo de nuevo",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion != 8);
    }

}
