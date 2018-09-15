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
abstract class RoomDecorator implements Room{
    protected Room specialRoom;
    
    public RoomDecorator(Room specialRoom){
        this.specialRoom = specialRoom;
    }
    public String showRoom(){
        return specialRoom.showRoom();
    }
}
