/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import java.text.ParseException;

import java.time.format.DateTimeFormatter;

import java.util.Locale;

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

    public Flight (String origin, String destination, String departureTime,
            String arrivalTime, String dateFlight, AirPlane airplane){
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.dateFlight = dateFlight;
        this.airplane = airplane;
    }

    
//    public void dateFormat() throws ParseException { //puxar so a data no formato dd/mm/yyyy
//    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
//    LocalDate date = LocalDate.parse(dateFlight, formatter);
//    System.out.println(date);
//    }
    
    
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

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDateOfFlight(String dateFlight) {
        this.dateFlight = dateFlight;
    }

    public void setAircraft(AirPlane airplane) {
        this.airplane = airplane;
    }
    
    
    
     @Override // pq é um metodo da super classe objeto
    public String toString(){
        String output;
        output = "Flight Information: \n";
        output += "\tDate: " + this.dateFlight + "\n";
        output += "\tFrom: " + this.origin + " to " + this.destination + "\n";
        output += "\tFlight time: " + this.departureTime + " to " + this.arrivalTime + "\n";   
              return output;
    }

}
