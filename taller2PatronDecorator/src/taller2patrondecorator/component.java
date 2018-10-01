/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2patrondecorator;

/**
 *
 * @author JUan Camilo Posada
 */
public interface component {
    String valorPago="";
    String referencia="";
    
    public void asignarValores(String pPago);
    public String mostrarValores();
   
}
