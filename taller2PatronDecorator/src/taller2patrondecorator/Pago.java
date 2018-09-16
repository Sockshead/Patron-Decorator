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
public class Pago implements component{
    private String valorPago="";
    private String referencia="";

    @Override
    public void asignarValores(String pValorPago, String pReferencia) {
        valorPago=pValorPago;
        referencia=pReferencia;
    }

    @Override
    public String mostrarValores() {
        return "se realizo el pago por valor de : "+valorPago;
    }

    @Override
    public String darReferencia() {
        return referencia;
    }
    
}
