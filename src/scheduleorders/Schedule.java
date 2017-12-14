/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleorders;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Schedule implements Serializable{
    private String restaurant, food , address, time, restaurantW, foodW,addressW, timeW;

    public Schedule(String restaurant, String food, String address, String time) {
        this.restaurant = restaurant;
        this.food = food;
        this.address = address;
        this.time = time;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return  "Restaurant: " + restaurant + "\nFood: " + food + "\nAddress: " + address + "\nTime: " + time +"\n" ;
    }
    
    
    
   
    
}
