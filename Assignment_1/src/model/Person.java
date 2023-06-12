/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author libby
 */
public class Person {
    
    private String name;
    private String address;
    private String birth;
    private String telePhone;
    private String faxPhone;
    private String email;
    private String socialSecurityNum;
    private String medicalRecordNum;
    private String healthPlanNum;
    private String bankAccountNum;
    private String licenseNum;
    private String vehicleIdentifiers;
    private String deviceIdentifiers;
    private String linkedIn;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSocialSecurityNum() {
        return socialSecurityNum;
    }

    public void setSocialSecurityNum(String socialSecurityNum) {
        this.socialSecurityNum = socialSecurityNum;
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

    public String getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(String bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getVehicleIdentifiers() {
        return vehicleIdentifiers;
    }

    public void setVehicleIdentifiers(String vehicleIdentifiers) {
        this.vehicleIdentifiers = vehicleIdentifiers;
    }

    public String getDeviceIdentifiers() {
        return deviceIdentifiers;
    }

    public void setDeviceIdentifiers(String deviceIdentifiers) {
        this.deviceIdentifiers = deviceIdentifiers;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }
    
    @Override
    public String toString(){
        return name;
    }

    
}
