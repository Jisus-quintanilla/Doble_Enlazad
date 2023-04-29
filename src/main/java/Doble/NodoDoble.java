/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doble;

/**
 *
 * @author Usuario
 */
public class NodoDoble {
    
    public String dato;
    NodoDoble siguiente,anterior;
    
    public NodoDoble(String dat){
    this(dat,null,null);
    } 
    
    public NodoDoble (String dat, NodoDoble s, NodoDoble a){
        dato=dat;
        siguiente=s;
        anterior=a;
    }
      
}
