/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2patrondecorator;

/**
 *
 * @author mate_
 */
public class Credito extends MediosDePago{
    
    String fecha;
    String banco;
    
    public Credito(component pMediosPago) {
        super(pMediosPago);
    }
    public String mostrarValores(){
       return " Pago realizado por: "+super.mostrarValores()+" fecha: "+this.fecha+" banco: "+this.banco;
    }
    public void asignarValores(String pPago){
        super.asignarValores("Credito");
        String[] info = pPago.split(",");
        this.fecha=info[0];
        this.banco=info[1];
    }
    
}
