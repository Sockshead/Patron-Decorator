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
abstract class MediosDePago implements component {
    protected component mediosPagopse;
    protected String mediopag="";
    
    public MediosDePago(component pMediosPago){
        mediosPagopse=pMediosPago;
    }
    public String mostrarValores(){
       return this.mediosPagopse.mostrarValores()+"Pago realizado por: "+mediopag;
    }
    public void asignarValores(String pPago){
        this.mediopag=pPago;
    }
}
