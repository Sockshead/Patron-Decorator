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
public class CurtainDecorator extends RoomDecorator{

    public CurtainDecorator(Room specialRoom) {
        super(specialRoom);
    }
   
    public String showRoom(){
        return specialRoom.showRoom()+addCurtain();
    }
    private String addCurtain(){
        return " + redCurtains";
    }

}
