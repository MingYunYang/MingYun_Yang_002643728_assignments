/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author libby
 */
public class Person {
    
    private String firstName;
    private String lastName;
    private String birth;
    private String SSN;
    private ArrayList<Address> address;
    private String telePhone;
    private String faxPhone;
    private ArrayList<Email> email;
    private String medicalRecordNum;
    private String healthPlanNum;
    private Vehicle vehicle;
    private Device device;
    private ArrayList<Bank> bank;
    private Certification certification;
    private String linkedIn;
    private Icon photo;
    
    public Person(){
        this.address = new ArrayList<Address>();
        this.email = new ArrayList<Email>();
        this.bank = new ArrayList<Bank>();
    }
    
    public Address addAddress(String s, String city, String zip, String state, String country, String type){
        Address a = new Address(s, city, zip, state, country, type);
        address.add(a);
        return a;
    }
    
    public void deleteAddress(Address a){
           address.remove(a);
    }
    
    public Email addEmail(String email, String type){
        Email e = new Email(email, type);
        this.email.add(e);
        return e;
    }
    
    public void deleteEmail(Email e){
        email.remove(e);
    }
    
    public void addDevice(String type, String model, String IMEI){
        this.device = new Device(type, model, IMEI);
    }
    
    public void addVehicle(String type, String model, String plate){
        this.vehicle = new Vehicle(type, model, plate);
    }
    
    public Bank addBank(String bankName, String routing, String account, String type){
        Bank b = new Bank(bankName, routing, account, type);
        this.bank.add(b);
        return b;
    }
    
    public void deleteBank(Bank b){
        bank.remove(b);
    }
    
    public void addCertification(String number, String date){
        this.certification = new Certification(number, date);
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public ArrayList<Address> getAddress() {
        return address;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getTelePhone() {
        return telePhone;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public String getFaxPhone() {
        return faxPhone;
    }

    public void setFaxPhone(String faxPhone) {
        this.faxPhone = faxPhone;
    }

    public ArrayList<Email> getEmail() {
        return email;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String socialSecurityNum) {
        this.SSN = socialSecurityNum;
    }

    public String getMedicalRecordNum() {
        return medicalRecordNum;
    }

    public void setMedicalRecordNum(String medicalRecordNum) {
        this.medicalRecordNum = medicalRecordNum;
    }

    public String getHealthPlanNum() {
        return healthPlanNum;
    }

    public void setHealthPlanNum(String healthPlanNum) {
        this.healthPlanNum = healthPlanNum;
    }

    public ArrayList<Bank> getBank() {
        return bank;
    }

    public Certification getCertification() {
        return certification;
    }

    public void setCertification(Certification certification) {
        this.certification = certification;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }
    
    public Icon getPhoto(){
        return photo;
    }
    
    public void setPhoto(Icon photo){
        this.photo = photo;
    }
    
    @Override
    public String toString(){
        return lastName + " " + firstName;
    }

    
}
