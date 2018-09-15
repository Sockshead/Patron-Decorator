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
public class dimensiones extends RoomDecorator{
    
    public dimensiones(Room specialRoom) {
        super(specialRoom);
    }
    public String showRoom(){
        return specialRoom.showRoom() + addDimensiones();
    }
    private String addDimensiones(){
        return " + 3x3 metros";
    }
    
}
