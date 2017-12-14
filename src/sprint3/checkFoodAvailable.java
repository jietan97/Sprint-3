/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint3;

import dsaassignment.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ong Chong Ren
 */
public class checkFoodAvailable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        mainMenu();

    }

    private static String location;
    private static String restaurant;
    private static String menu;
    private static String menuDescription;
    private static final boolean status = true;
    private static Integer choice = 0;
    private static String option;
    private static List<Food> foodList = new ArrayList<>();

    public static void mainMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Fastest Deliverymen's ");
        System.out.println("1.Add Food Records ");
        System.out.println("2.Retrieve Food Details ");
        System.out.print("Choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                addFoodRecord();
                break;
            case 2:
                retriveFoodRecord();
                break;
            default:
                System.out.println("Please select 1 to 2");
                break;
        }

    }

    private static void addFoodRecord() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your location: ");
            location = sc.nextLine();
            System.out.println("Please enter restaurant: ");
            restaurant = sc.nextLine();
            System.out.println("Please enter menu: ");
            menu = sc.nextLine();
            System.out.println("Please enter menu description: ");
            menuDescription = sc.nextLine();

            System.out.print("\nDo You want to continue to add new customer detail ? (yes / no): ");
            option = sc.nextLine();

        } while (option.equals("yes") || option.equals("y"));

        Food foodDetails = new Food(location, restaurant, menu, menuDescription);
        foodList.add(foodDetails);

        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("Food.dat"));
            ooStream.writeObject(foodList);
            ooStream.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    private static void retriveFoodRecord() {
        try {
            ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("Food.dat"));
            foodList = (ArrayList) (oiStream.readObject());
            oiStream.close();
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        do {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < foodList.size(); i++) {

                if (status != false) {
                    
                    System.out.println("Your food is available");
                    System.out.println("Location:" + foodList.get(i).getLocation());
                    System.out.println("Restaurant: " + foodList.get(i).getRestaurant());
                    System.out.println("Menu: " + foodList.get(i).getMenu());
                    System.out.println("Menu Description:" + foodList.get(i).getMenuDescription());

                } else {
                    System.out.print("The food is not available. Please try again.");

                }
                
            }
            System.out.print("\nDo You want to continue to retrive new available detail ? (yes / no): ");
            option = sc.nextLine();

        } while (option.equals("yes") || option.equals("y"));

    }

}
