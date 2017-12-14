/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaassignment;

/**
 *
 * @author Ong Chong Ren
 */
import java.io.*;

public class Customer implements Serializable {

  
    private String name;
    private String gender;
    private String homeAddress;
    private String phoneNumber;

    public Customer() {
        
        
    }

    public Customer(String name, String gender, String homeAddress, String phoneNumber) {
        this.name = name;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", gender=" + gender + ", homeAddress=" + homeAddress + ", phoneNumber=" + phoneNumber + '}';
    }

   
 

    
}
