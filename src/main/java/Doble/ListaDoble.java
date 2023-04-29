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
public class ListaDoble {
    
    
    private NodoDoble inicio, fin;

    public ListaDoble() {
        inicio = fin = null;
    }

    public boolean estVacia() {
        return inicio == null;
    }

    public void agregarAlFinal(String dat) {
        
        if (!estVacia()) {
            fin = new NodoDoble(dat, null, fin);
            fin.anterior.siguiente = fin;
        } else {
            inicio = fin = new NodoDoble(dat);
        }
    }

    public void agregarAlInicio(String dat) {
        
        if (!estVacia()) {
            inicio = new NodoDoble(dat, inicio, null);
            inicio.siguiente.anterior = inicio;
        } else {
            inicio = fin = new NodoDoble(dat);
        }
    }

    public void mostrarListaInicioFin() {
        if (!estVacia()) {
            String datos = "";
            NodoDoble auxiliar = inicio;
            while (auxiliar != null) {
                datos = datos + " " + auxiliar.dato+ " ";
                auxiliar = auxiliar.siguiente;
            }
            JOptionPane.showMessageDialog(null, datos,
                    "Mostrando Lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
        }
    }
 
    public void mostrarListaFinInicio() {
        if (!estVacia()) {
            String datos = "";
            NodoDoble auxiliar = fin;
            while (auxiliar != null) {
                datos = datos + " " + auxiliar.dato + " ";
                auxiliar = auxiliar.anterior;
            }
            JOptionPane.showMessageDialog(null, datos, "Mostrando Lista de Inicio a Fin", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void MostrarFin(String dat) {
        NodoDoble inicio;

            inicio = new NodoDoble(dat, fin,null);
            inicio.siguiente.anterior = inicio;    
    }
    
    public void MostrarInicio(String dat) {
        NodoDoble fin;
       

            fin = new NodoDoble(dat, null,inicio);
            fin.anterior.siguiente = fin;    
    }
    

}
