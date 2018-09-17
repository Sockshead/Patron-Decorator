package taller2patrondecorator;

import java.util.ArrayList;
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
                case '2':
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
                case '3':
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
        for (component pago : pagos) {
            if (pago.darUsuario().equalsIgnoreCase(usuario)) {
                historial = historial + pago.mostrarValores() + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, historial);
    }
}
