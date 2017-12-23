package affiliate;

import adt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 * @author Tan Kai Lun Group 10 Member group 3 part A Task ID : 152569170 User
 * story : As a restaurant manager, I want to add food details into food menu,
 * so that customer can select the food for order.
 */
public class foodMenu {

    static foodMenuClass fmc = new foodMenuClass();
    static Scanner sc = new Scanner(System.in);
    static String toAddFood = "y", toEditFood = "y", mainChoice, leaveMenu = "y";
    //static String affID, openDays, openTimeStart, openTimeEnd, foodID, foodName, foodDesc, foodPrice, promotionPrice;
    //static LinkedStack<foodMenuClass> foodM = new LinkedStack<>();
    static ListInterface<foodMenuClass> foodM = new LList<>();
//    static LinkedStack<String> affIDL = new LinkedStack<>();
//    static LinkedStack<String> openDaysL = new LinkedStack<>();
//    static LinkedStack<String> openTimeStartL = new LinkedStack<>();
//    static LinkedStack<String> openTimeEndL = new LinkedStack<>();
//    static LinkedStack<String> foodIDL = new LinkedStack<>();
//    static LinkedStack<String> foodNameL = new LinkedStack<>();
//    static LinkedStack<String> foodDescL = new LinkedStack<>();
//    static LinkedStack<String> foodPriceL = new LinkedStack<>();
//    static LinkedStack<String> promotionPriceL = new LinkedStack<>();

    public static void main(String[] args) {
        while (leaveMenu.equals("y")) {
            //foodM = retrieveFoodMenu();
            FoodMainMenu();
            //saveFoodMenu();
        }
    }

    public static void FoodMainMenu() {
        toAddFood = "y";
        System.out.printf("\n-- Fastest Deliveryman --\nrestaurant food menu\n====================================\n"
                + "1) Add food menu\n"
                + "2) Edit food menu\n");
        do {
            System.out.printf("Enter number : ");
            mainChoice = sc.nextLine();

            if (!mainChoice.equals("1") && !mainChoice.equals("2")) {
                System.out.printf("Invalid choice, ");
            }
        } while (!mainChoice.equals("1") && !mainChoice.equals("2"));

        switch (mainChoice) {
            case "1":
                affID();
                while (toAddFood.equals("y")) {
                    AddFood();
                }
                break;
            case "2":
                affID();
                while (toEditFood.equals("y")) {
                    EditFood();
                }
                break;
        }
    }

    public static void affID() {
        System.out.println("\n-- Fastest Deliveryman --\nrestaurant food menu\n====================================");
        System.out.printf("Enter Affiliate ID\t: ");
        fmc.affID = sc.nextLine();
    }

    public static void AddFood() {
//        System.out.println("\nBusiness Hour\n====================================");
//        System.out.printf("Business Days in week\t:\n");
//        System.out.println("format:1,2,3,4,5(Mondays to Fridays)");
//        System.out.printf("PLease enter the number\t:");
//        openDays = sc.nextLine();
//        System.out.printf("\n\nBusiness Time - Start\t(23:00):");
//        openTimeStart = sc.nextLine();
//        System.out.printf("\n\nBusiness Time - End\t(23:00):");
//        openTimeStart = sc.nextLine();
        System.out.println("\nFoods\n====================================");
        fmc.foodID = String.format("f%03d", foodM.getNumberOfEntries() + 1);
        //foodID = "f001";
        System.out.println("Food ID\t\t: " + fmc.foodID);
        System.out.printf("Name\t\t: ");
        fmc.foodName = sc.nextLine();
        System.out.printf("Description\t: ");
        fmc.foodDesc = sc.nextLine();
        System.out.printf("Price(RM)\t\t: ");
        fmc.foodPrice = sc.nextLine();
        System.out.printf("Promotion price(RM)\t: ");
        fmc.promotionPrice = sc.nextLine();
        System.out.printf("Add foods?(y=yes,n=no)\t: ");
        toAddFood = sc.nextLine();
        
        foodM = retrieveFoodMenu();
        foodM.add(fmc);
        
        saveFoodMenu();

//        foodIDL.push(foodID);
//        foodNameL.push(foodName);
//        foodDescL.push(foodDesc);
//        foodPriceL.push(foodPrice);
//        promotionPriceL.push(promotionPrice);
//        affIDL.push(affID);
    }

    public static void EditFood() {
        System.out.printf("Enter food ID\t: ");
        fmc.foodID = sc.nextLine();
        System.out.printf("Name\t\t: ");
        fmc.foodName = sc.nextLine();
        System.out.printf("Description\t: ");
        fmc.foodDesc = sc.nextLine();
        System.out.printf("Price(RM)\t\t: ");
        fmc.foodPrice = sc.nextLine();
        System.out.printf("Promotion price(RM)\t: ");
        fmc.promotionPrice = sc.nextLine();
        System.out.printf("Edit more foods?(y=yes,n=no)\t: ");
        toEditFood = sc.nextLine();
    }

    public static class foodMenuStream implements Serializable {

        public String affID = null;
//        public String openDays = null;
//        public String openTimeStart = null;
//        public String openTimeEnd = null;
//        public String restaufoodID = null;
        public String foodName = null;
        public String foodDesc = null;
        public String foodPrice = null;
        public String promotionPrice = null;
    }

//    public static void saveFoodMenu() throws IOException, ClassNotFoundException {
//        ObjectOutputStream foodOutputStream
//                = new ObjectOutputStream(new FileOutputStream("foodMenu.dat"));
//
//        foodMenuStream foodMStrm = new foodMenuStream();
//        foodMStrm.affID = fmc.affID;
//        foodMStrm.openDays = fmc.openDays;
//        foodMStrm.openTimeStart = fmc.openTimeStart;
//        foodMStrm.openTimeEnd = fmc.openTimeEnd;
//        foodMStrm.restaufoodID = fmc.restaufoodID;
//        foodMStrm.foodName = fmc.foodName;
//        foodMStrm.foodDesc = fmc.foodDesc;
//        foodMStrm.foodPrice = fmc.foodPrice;
//        foodMStrm.promotionPrice = fmc.promotionPrice;
//
//        foodOutputStream.writeObject(foodMStrm);
//        foodOutputStream.close();
//    }
    
    public static void saveFoodMenu() {
        
        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("foodMenu.dat"));
            ooStream.writeObject(foodM);
            ooStream.close();
          } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
          } catch (IOException ex) {
              System.out.println(ex.getMessage());
            System.out.println("IOException");
          }
    }

//    public static void readFoodMenu() throws IOException, ClassNotFoundException {
//        try {
//            ObjectInputStream foodInputStream
//                    = new ObjectInputStream(new FileInputStream("foodMenu.dat"));
//
//            foodMenuStream foodMS = (foodMenuStream) foodInputStream.readObject();
//            foodInputStream.close();
////            System.out.println("\nRegistration Success\n====================================");
////            System.out.println("Restaurant ID\t: " + foodMS.affID);
////            System.out.println("Restaurant\t: " + foodMS.openDays + "\n");
////            System.out.println("Owner's name\t: " + foodMS.openTimeStart);
////            System.out.println("IC number\t: " + foodMS.openTimeEnd);
////            System.out.println("Tel number\t: " + foodMS.restaufoodID);
////            System.out.println("Email\t\t: " + foodMS.foodName);
//            //System.out.println("Address\t\t: \n\t" + foodMS.address1 + "\n\t" + foodMS.address2 + "\n\t" + foodMS.zipCode + " " + foodMS.city + "\n\t" + foodMS.state + "\n");
//        } catch (FileNotFoundException ex) {
//            System.out.println("\n-- Fastest Deliveryman --\nAffiliate Details\n====================================");
//            System.out.println("No record");
//        }
//    }
    
    public static ListInterface<foodMenuClass> retrieveFoodMenu() {
         try {
              ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("foodMenu.dat"));
              foodM = (ListInterface<foodMenuClass>) (oiStream.readObject());
              oiStream.close();
            } catch (FileNotFoundException ex) {
              System.out.println("FileNotFoundException");
            } catch (IOException ex) {
              System.out.println("IOException");
            } catch (ClassNotFoundException ex) {
              System.out.println("ClassNotFoundException");
            }
         return foodM;
    }
}
