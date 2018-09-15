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
public class ColorDecorator extends RoomDecorator{
    
    public ColorDecorator(Room specialRoom) {
        super(specialRoom);
    }
    public String showRoom (){
        return specialRoom.showRoom()+addColor();
    }
    private String addColor(){
        return " + Blue Color";
    }
}
