/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprint3;

import java.util.Scanner;
import java.util.UUID;

public class orderConfirmation {

    public static int counter = 0;
    static String orderID;
    //public double subTotal;
    public static double runningTotal = 0.00;
    private static double itemPrice;
    static boolean ordering = true;
    static Scanner input = new Scanner(System.in);
    
    static double subTotal = 0.0;
    

    public static void menu() {

        System.out.println("=========================================");
        System.out.println("Welcome \n1. Fried Chicken(RM 5.00) \n2. Nasi Goreng Thai(RM 6.50)\n3. Thai Mee (RM 5.50) \n4. Done");
        System.out.println("=========================================");
        System.out.println("Choice: ");
    }

    public static double itemPrice(int foodItem) {
        if (foodItem == 1) {
            //Fried Chicken= RM 5.00
            System.out.println("\nYou've ordered  Fried Chicken.");
            itemPrice = 5.00;
        }
        if (foodItem == 2) {
            //Nasi Goreng Thai = RM 5.00
            System.out.println("\nYou've ordered Nasi Goreng Thai.");
            itemPrice = 6.50;
        }
        if (foodItem == 3) {
            //Thai Mee = RM 5.00
            System.out.println("\nYou've ordered Thai Mee.");
            itemPrice = 5.50;
        }
        quantity();
        return itemPrice;
    }

    public static double quantity() {

        System.out.println("\nEnter quantity:");
        double quantity = input.nextDouble();
        subTotal(quantity, itemPrice);
        return quantity;
    }

    public static double subTotal(double quantity, double itemPrice) {
        //double 
        subTotal = quantity * itemPrice;
        System.out.printf("\nSubtotal: RM %.2f\n", subTotal);
        runningTotal += subTotal;
        return subTotal;
    }

    public static void done() {
        ordering = false;
        orderID = String.format("ORD%03d", ++counter);
        //UUID uniqueKey = UUID.randomUUID();
        System.out.println("\n\n");
        //System.out.println("Order ID:" + uniqueKey);
        System.out.println("Order ID:" + orderID);
        System.out.println("===================");
        System.out.println("Order Confirmation");
        System.out.println("===================");
        System.out.printf("Total: RM %.2f\n", runningTotal);
        System.out.println("You have order complete.\nPlease enjoy your meal.");
        runningTotal = 0.0;
    }

    public static void main(String[] args) {
        int menuOption;
        int foodItem;
        String newOrder = "y";
        input = new Scanner(System.in);

        do {
            while (newOrder.equals("y")) {
                double runningTotal = 0.00;
                menu();
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
                        System.out.println("\nDo you want to add new order?(y=yes,n=no)");
                        newOrder = input.next();
                        break;
                    default:
                        System.out.println("\nInvalid option.\n");
                }
            }
        } while (ordering);
        {
        }
    }

}
