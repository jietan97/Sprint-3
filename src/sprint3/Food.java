/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint3;

/**
 *
 * @author Ong Chong Ren
 */
import dsaassignment.*;
import java.io.*;
import java.util.Objects;

public class Food implements Serializable {

    private String location;
    private String restaurant;
    private String menu;
    private String menuDescription;

    public Food() {
    }

    public Food(String location, String restaurant, String menu, String menuDescription) {
        this.location = location;
        this.restaurant = restaurant;
        this.menu = menu;
        this.menuDescription = menuDescription;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Food other = (Food) obj;
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.restaurant, other.restaurant)) {
            return false;
        }
        if (!Objects.equals(this.menu, other.menu)) {
            return false;
        }
        if (!Objects.equals(this.menuDescription, other.menuDescription)) {
            return false;
        }
        return true;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public String getMenu() {
        return menu;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    @Override
    public String toString() {
        return "Food{" + "location=" + location + ", restaurant=" + restaurant + ", menu=" + menu + ", menuDescription=" + menuDescription + '}';
    }

}
