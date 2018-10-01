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
public class Efectivo extends MediosDePago {
    String fecha;
    
    public Efectivo(component pMediosPago) {
        super(pMediosPago);
    }
    
    public String mostrarValores(){
       return " Pago realizado por: "+super.mostrarValores()+ " Fecha: "+this.fecha;
    }
    public void asignarValores(String pPago){
        super.asignarValores("Efectivo");
        this.fecha=pPago;
    }

    
}
