/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerpatrondecorator;

/**
 *
 * @author JUan Camilo Posada
 */
public class TallerPatronDecorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Room room =new dimensiones( new CurtainDecorator(new ColorDecorator(new SingleRoom())));
        System.out.println(room.showRoom());
    }
    
}
