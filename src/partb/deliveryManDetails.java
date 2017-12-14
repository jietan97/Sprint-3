/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partb;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class deliveryManDetails implements Serializable {
    
    private String newDeliveryName;
    private String gender;
    private String icNo;
    private String phoneNo;
    private String homeAddress;
    private String emergencyContact;
    private double salary; 
    private String status;
    private String typesOfFullTime;
    private int deliveredDonePerDay;
    private int totalTravelPerDay;

    public deliveryManDetails() {
        
    }

    public deliveryManDetails(String newDeliveryName, String gender, String icNo, String phoneNo, String homeAddress, String emergencyContact, double salary, String status, String typesOfFullTime) {
        this.newDeliveryName = newDeliveryName;
        this.gender = gender;
        this.icNo = icNo;
        this.phoneNo = phoneNo;
        this.homeAddress = homeAddress;
        this.emergencyContact = emergencyContact;
        this.salary = salary;
        this.status = status;
        this.typesOfFullTime = typesOfFullTime;
    }

    public deliveryManDetails(String newDeliveryName, String gender, String icNo, String phoneNo, String homeAddress, String emergencyContact, double salary, String status, String typesOfFullTime, int deliveredDonePerDay, int totalTravelPerDay) {
        this.newDeliveryName = newDeliveryName;
        this.gender = gender;
        this.icNo = icNo;
        this.phoneNo = phoneNo;
        this.homeAddress = homeAddress;
        this.emergencyContact = emergencyContact;
        this.salary = salary;
        this.status = status;
        this.typesOfFullTime = typesOfFullTime;
        this.deliveredDonePerDay = deliveredDonePerDay;
        this.totalTravelPerDay = totalTravelPerDay;
    }
    
    public String getNewDeliveryName() {
        return newDeliveryName;
    }

    public String getGender() {
        return gender;
    }

    public String getIcNo() {
        return icNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public double getSalary() {
        return salary;
    }

    public String getStatus() {
        return status;
    }

    public String getTypesOfFullTime() {
        return typesOfFullTime;
    }

    public int getDeliveredDonePerDay() {
        return deliveredDonePerDay;
    }

    public int getTotalTravelPerDay() {
        return totalTravelPerDay;
    }
    
    public void setNewDeliveryName(String newDeliveryName) {
        this.newDeliveryName = newDeliveryName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIcNo(String icNo) {
        this.icNo = icNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTypesOfFullTime(String typesOfFullTime) {
        this.typesOfFullTime = typesOfFullTime;
    }

    public void setDeliveredDonePerDay(int deliveredDonePerDay) {
        this.deliveredDonePerDay = deliveredDonePerDay;
    }

    public void setTotalTravelPerDay(int totalTravelPerDay) {
        this.totalTravelPerDay = totalTravelPerDay;
    }

    @Override
    public String toString() {
        return "deliveryManDetails{" + "newDeliveryName=" + newDeliveryName + ", gender=" + gender + ", icNo=" + icNo + ", "
                + "phoneNo=" + phoneNo + ", homeAddress=" + homeAddress + ", emergencyContact=" + emergencyContact + ", salary=" + salary + ", "
                + "status=" + status + ", typesOfFullTime=" + typesOfFullTime + '}';
    }
   
}
