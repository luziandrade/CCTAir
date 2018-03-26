package driver;

import java.text.ParseException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diogo Pessoa, Luzilene and Luana
 */
public class CCTAir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        AirPlane aviao = new AirPlane("Embraer", "St-34", 25);
        
        System.out.println(aviao.toString());
        
        Flight bhz = new Flight("Dublin", "Belo", "12:35", "23:57", "12/04/2018", aviao);
        
        //bhz.dateFormat();
        
        System.out.println(bhz.toString());
        
        
        
        
    }
    
}
