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
public class AirPlane {
    
    private final String make; // final because we can't change after the isntance was created
    private final String model;
    private int capacity;
    private Pilot pilot;
   
    public AirPlane(String make, String model, int capacity){
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }
    
    public Pilot getPilot() {
        return pilot;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public void assingPilot(Pilot pilot){
        this.pilot = pilot;    
    }
    
   @Override // pq é um metodo da super classe objeto
    public String toString(){
        String output;
        output = "Airplane Information: \n";
        output += "\tAircraft: " + this.make;
        output += " Model: " + this.model + "\n";
        output += "\tCapacity: " + this.capacity + " seats\n";
         //output += "\tPilot : " +  this.pilot.getName();
        return output;
    }
    
}
