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
public class Baloto extends MediosDePago{
    
    public Baloto(component pMediosPago) {
        super(pMediosPago);
    }
    
    public String mostrarValores(){
       return mediosPagopse.mostrarValores()+ tipoMedioPago();
    }
    public void asignarValores(String pValor,String pReferencia,String pUsuario){
        mediosPagopse.asignarValores(pValor,pReferencia,pUsuario);
    }
    private String tipoMedioPago() {
        
        return " Pago realizado por Baloto Numero de referencia: "+super.darReferencia();
    }
}
