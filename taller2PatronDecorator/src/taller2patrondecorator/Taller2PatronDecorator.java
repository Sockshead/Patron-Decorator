/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2patrondecorator;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

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
        ArrayList<component> pagos = new ArrayList();
        Random ran = new Random();
        component com;
        String usuario = "";
        try {
            usuario = JOptionPane.showInputDialog("Ingrese su numero de cedula");
            int entrada = Integer.parseInt(JOptionPane.showInputDialog("1. Pagar \n 2. Ver Pagos \n 0. Salir"));

            do {
                switch (entrada) {
                    case 1:
                        int entrada1 = Integer.parseInt(JOptionPane.showInputDialog("1. Pagar via Baloto \n 2. Pagar en Efectivo \n 3.Pagar via Credito \n 4.Regresar"));
                        switch (entrada1) {
                            case 1:
                                com = new Baloto(new Pago());
                                int entrada2 = Integer.parseInt(JOptionPane.showInputDialog("1. Asignar valor a pagar \n 2. Regresar "));
                                switch (entrada2) {
                                    case 1:
                                        String Valor = JOptionPane.showInputDialog("Ingrese valor a pagar: ");
                                        com.asignarValores(Valor, "" + (ran.nextInt(9000000) + 1000000), usuario);
                                        pagos.add(com);
                                        JOptionPane.showMessageDialog(null, com.mostrarValores());
                                        break;
                                }
                                break;
                            case 2:
                                com = new Efectivo(new Pago());
                                entrada2 = Integer.parseInt(JOptionPane.showInputDialog("1. Asignar valor a pagar \n 2. Regresar "));
                                switch (entrada2) {
                                    case 1:
                                        String Valor = JOptionPane.showInputDialog("Ingrese valor a pagar: ");
                                        com.asignarValores(Valor, "" + (ran.nextInt(9000000) + 1000000), usuario);
                                        pagos.add(com);
                                        JOptionPane.showMessageDialog(null, com.mostrarValores());
                                        break;
                                }
                                break;
                            case 3:
                                com = new Credito(new Pago());
                                entrada2 = Integer.parseInt(JOptionPane.showInputDialog("1. Asignar valor a pagar \n 2. Regresar "));
                                switch (entrada2) {
                                    case 1:
                                        String Valor = JOptionPane.showInputDialog("Ingrese valor a pagar: ");
                                        com.asignarValores(Valor, "" + (ran.nextInt(9000000) + 1000000), usuario);
                                        pagos.add(com);
                                        JOptionPane.showMessageDialog(null, com.mostrarValores());
                                        break;
                                }
                                break;

                        }
                        break;
                    case 2:
                        String historial = "";
                        for (component pago : pagos) {
                            if (pago.darUsuario().equalsIgnoreCase(usuario)) {
                                historial = historial + pago.mostrarValores() + "\n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, historial);
                        break;
                }
            } while ((0 <= entrada && entrada <= 3));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese una opcion Valida");
        }
    }
}
