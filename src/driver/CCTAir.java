package driver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diogo Pessoa 2016326, Luana Andrade 2016270 and Luzilene OLiveira 2016299
 */
public class CCTAir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Pilot p1 = new Pilot("Diogo", "04-10-80", "67 Blessington St", 121345, 1); 
        
        AirPlane aviao = new AirPlane("Embraer", "St-34", "E", 25);
        
        Flight bhz = new Flight("Dublin", "Belo", "12:35", "23:57", "12/04/2018", aviao);
       
        aviao.assingPilot(p1);
        
        System.out.println(bhz.toString());
    }
}
