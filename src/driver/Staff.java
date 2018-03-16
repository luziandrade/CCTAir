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
abstract class Staff {
    
    private String name = "";
    private String dob = "";
    private String address = "";
    private int pps = 0;
    
    public Staff(String name, String dob, String address, int pps){
        this.name = name;
        this.name = dob;
        this.address = address;
        this.pps = pps;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress() {
        return address;
    }

    public int getPps() {
        return pps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPps(int pps) {
        this.pps = pps;
    }

}
