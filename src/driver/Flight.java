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
public class Flight {

    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String dateFlight;
    private AirPlane airplane;

    public Flight(String origin, String destination, String departureTime,
            String arrivalTime, String dateFlight, AirPlane airplane) {

        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.dateFlight = dateFlight;
        this.airplane = airplane;
    }
    
    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getDateOfFlight() {
        return dateFlight;
    }

    public AirPlane getAircraft() {
        return airplane;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setDateFlight(String dateFlight) {
        this.dateFlight = dateFlight;
    }

    public void setAircraft(AirPlane airplane) {
        this.airplane = airplane;
    }
    
    public void schedule(String arrivalTime){
        this.arrivalTime = arrivalTime;
    }
    
    public void schedule(String arrivalTime, String departureTime){
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }
    
    @Override // pq é um metodo da super classe objeto
    public String toString() {
        String output;
        output = "----------// - CCTAir - //----------\n";
        output += "Flight Information: \n";
        output += "\tDate: " + this.dateFlight + "\n";
        output += "\tFrom: " + this.origin + " to " + this.destination + "\n";
        output += "\tFlight time: " + this.departureTime + " to " + this.arrivalTime + "\n";
        output += "\tAirPlane Information" + this.airplane;
        return output;
    }

}
