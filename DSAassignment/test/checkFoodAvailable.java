/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ong Chong Ren
 */
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;

public class checkFoodAvailable {

    /**
     * @param args the command line arguments
     */
    Scanner sc = new Scanner(System.in);

    private static void doSave() {
        //serialize the List
        List<String> menuList = new ArrayList<>();
          try {
      ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("menu.dat"));
      ooStream.writeObject(menuList);
      ooStream.close();
   
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
      
    }

    public double subTotal;
    public static double runningTotal;
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println("Welcome To Fastest Deliveryman's \n1. Fried Chicken (RM 5.00) \n2. Nasi Goreng Thai (RM 5.00)\n3. Thai Mee (RM5.00) \n4. Done\n\n");
    }

    public static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            // burger= RM5.00
            System.out.println("\nYou've ordered a Fried Chicken\n");
            itemPrice = 5.00;
        }
        if (foodItem == 2) {
            // fries = $5.00
            System.out.println("\nYou've ordered Nasi Goreng Thai\n");
            itemPrice = 5.00;
        }
        if (foodItem == 3) {
            // soda = $5.00
            System.out.println("\nYou've ordered Thai Mee\n");
            itemPrice = 5.00;
        }
        quantity();
        return itemPrice;
    }

    public static double quantity() {
        System.out.printf("Enter quantity: ");
        double quantity = input.nextDouble();
        subTotal(quantity, itemPrice);
        return quantity;
    }

    public static double subTotal(double quantity, double itemPrice) {
        double subTotal = quantity * itemPrice;
        System.out.println("Subtotal: " + subTotal);
        runningTotal += subTotal;
        return subTotal;
    }

    public static void done() {
        ordering = false;
     
        System.out.println("Total " + "RM : "+ runningTotal);
        System.out.println("Please enjoy your meal.");
    }

    public static void main(String[] args) {
       
        
        //doSave();
        
        Scanner scanner = new Scanner(System.in);

        int menuOption;
        int foodItem = 0;
        input = new Scanner(System.in);

        do {
            double runningTotal = 0;
            menu();
            System.out.printf("Choice: ");
            menuOption = input.nextInt();
            switch (menuOption) {
                case 1:
                    foodItem = 1;
                    itemPrice(foodItem);
                    break;
                case 2:
                    foodItem = 2;
                    itemPrice(foodItem);
                    break;
                case 3:
                    foodItem = 3;
                    itemPrice(foodItem);
                    break;
                case 4:
                    done();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (ordering);

    }

}
