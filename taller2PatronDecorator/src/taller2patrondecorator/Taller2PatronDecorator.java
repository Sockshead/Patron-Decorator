/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2patrondecorator;

import java.util.Random;

/**
 *
 * @author JUan Camilo Posada
 */
public class Taller2PatronDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random ran = new Random();
        component com = new Efectivo(new Pago());
        com.asignarValores("2000",""+(ran.nextInt(9000000) + 1000000));
        System.out.println(com.mostrarValores());
    }
    
}
