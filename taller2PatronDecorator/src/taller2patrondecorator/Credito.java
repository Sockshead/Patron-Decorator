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
    
    public Credito(component pMediosPago) {
        super(pMediosPago);
    }
    public String mostrarValores(){
       return mediosPagopse.mostrarValores()+ tipoMedioPago();
    }
    public void asignarValores(String pValor,String pReferencia){
        mediosPagopse.asignarValores(pValor,pReferencia);
    }
    private String tipoMedioPago() {
        
        return " Pago realizado por Credito Numero de referencia: "+super.darReferencia();
    }
    
}
