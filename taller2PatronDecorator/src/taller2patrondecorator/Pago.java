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
    private String usuario="";

    @Override
    public void asignarValores(String pPago) {
        String[] para =pPago.split(",");
        valorPago=para[0];
        referencia=para[1];
        usuario=para[2];
    }

    @Override
    public String mostrarValores() {
        return usuario+","+" se realizo el pago por valor de : "+valorPago+" Numero de referencia: "+darReferencia();
    }

    public String darReferencia() {
        return referencia;
    }

    public String darUsuario() {
        return usuario;
    }
    
}
