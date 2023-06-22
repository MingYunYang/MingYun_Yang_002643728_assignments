/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author libby
 */
public class Address {
    
    private String streetLine;
    private String city;
    private String zipCode;
    private String state;
    private String country; 
    private String type;
    
    public Address(String s, String city, String zip, String state, String country, String type){
        this.streetLine = s;
        this.city = city;
        this.zipCode = zip;
        this.state = state;
        this.country = country;
        this.type = type;
    }
    
    public String printAddress(){
        return streetLine + ", " + city + ", " + zipCode + ", " + state + ", " + country;
    }

    public String getStreetLine() {
        return streetLine;
    }

    public void setStreetLine(String streetLine) {
        this.streetLine = streetLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getType(){
        return type;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    @Override
    public String toString(){
        return printAddress();
    }
    
    
}
