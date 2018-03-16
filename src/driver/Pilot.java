/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author Diogo Pessoa
 */
public class Pilot extends Staff {
    
    int rating = 0;
    
    private Pilot(String name, String dob, String address, int pps, int rating){
        super(name, dob, address, pps);
        
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
    
    //TODO - RATING WITH ENUM, INSTANTIATE
    
}
