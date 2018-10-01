package taller2patrondecorator;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;

public class Taller2PatronDecorator {

    //variables de clase
    private ArrayList<component> pagos;
    
    String usuario;

    //Métodos
    public static void main(String[] xxx) {
        new Taller2PatronDecorator();
    }

    public Taller2PatronDecorator() {
        this.pagos = new ArrayList();
        this.usuario = "";
        this.menu();
    }

    private void menu() {
        char opcion;
        do {
            this.usuario = JOptionPane.showInputDialog("Ingrese su numero de cedula");
            String x = JOptionPane.showInputDialog("=======OPCIONES=========\n"
                    + "1. Realizar Pago \n"
                    + "2. Ver historial de pagos \n"
                    + "0. SALIR "
            );
            opcion = x.charAt(0);
            switch (opcion) {
                case '1':
                    this.rPago();
                    break;
                case '2':
                    if (!this.pagos.isEmpty()) {
                        this.verPagos();
                    } else {
                        JOptionPane.showMessageDialog(null, "Regresa aqui despues de realizar tu primer pago!", "Error", 0);
                    }
                    break;
                case '0':
                    JOptionPane.showMessageDialog(null, "CHAO PESCAO..!", "Despedida", 2);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ESE CASO NO EXISTE..!", "Error", 0);
                    break;
            }
        } while (opcion != '0');
    }

    private void rPago() {
        Random ran = new Random();
        Date date=new Date();
        component com;
        char opcion;
        do {
            String x = JOptionPane.showInputDialog("=======OPCIONES=========\n"
                    + "1. Pagar via Baloto \n"
                    + "2. Pagar en Efectivo \n"
                    + "3. Pagar via Credito \n"
                    + "0. Regresar "
            );
            opcion = x.charAt(0);
            switch (opcion) {
                case '1':
                    Pago pago= new Pago();
                    
                    int entrada2 = Integer.parseInt(JOptionPane.showInputDialog("1. Asignar valor a pagar \n 2. Regresar "));
                    switch (entrada2) {
                        case 1:
                            String Valor = JOptionPane.showInputDialog("Ingrese valor a pagar: ");
                            pago.asignarValores(Valor+ "," + (ran.nextInt(9000000) + 1000000)+","+ usuario);
                            com = new Baloto(pago);
                            com.asignarValores(date+"");
                            pagos.add(com);
                            JOptionPane.showMessageDialog(null, com.mostrarValores());
                            break;
                    }
                    break;
                case '2':
                    Pago pagoE= new Pago();
                    entrada2 = Integer.parseInt(JOptionPane.showInputDialog("1. Asignar valor a pagar \n 2. Regresar "));
                    switch (entrada2) {
                        case 1:
                            String Valor = JOptionPane.showInputDialog("Ingrese valor a pagar: ");
                            pagoE.asignarValores(Valor+ "," + (ran.nextInt(9000000) + 1000000)+","+ usuario);
                            com=new Efectivo (pagoE);
                            com.asignarValores(date+"");
                            pagos.add(com);
                            JOptionPane.showMessageDialog(null, com.mostrarValores());
                            break;
                    }
                    break;
                case '3':
                    Pago pagoC= new Pago();
                    entrada2 = Integer.parseInt(JOptionPane.showInputDialog("1. Asignar valor a pagar \n 2. Regresar "));
                    switch (entrada2) {
                        case 1:
                            String Valor = JOptionPane.showInputDialog("Ingrese valor a pagar: ");
                            pagoC.asignarValores(Valor+ "," + (ran.nextInt(9000000) + 1000000)+","+ usuario);
                            com = new Credito (pagoC);
                            com.asignarValores(date+","+"Bancolombia");
                            pagos.add(com);
                            JOptionPane.showMessageDialog(null, com.mostrarValores());
                            break;
                    }
                    break;
                case '0':
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ESE CASO NO EXISTE..!", "Error", 0);
                    break;
            }
        } while (opcion != '0');
    }

    private void verPagos() {
       String historial = "Historial de pagos: \n";
       String user="";
       
        for (component pago : pagos) {
            String[] info = pago.mostrarValores().split(",");
            user=info[0];
            info =user.split(":");
            user=info[1].trim();
            if (user.equalsIgnoreCase(usuario)) {
                historial = historial + pago.mostrarValores() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, historial);
    }
}
