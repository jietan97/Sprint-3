package affiliate;

import java.util.Scanner;

/**
 * @author Tan Kai Lun Group 10 Member group 3 part A Task ID : 152569170 User
 * story : As a restaurant manager, I want to add food details into food menu,
 * so that I can customer can select the food for order.
 */
public class foodMenu {

    static Scanner sc = new Scanner(System.in);
    static String toAddFood = "y", toEditFood = "y", mainChoice, leaveMenu = "y";
    static String affID, openDays, openTimeStart, openTimeEnd, foodID, foodName, foodDesc, foodPrice, promotionPrice;

    static LinkedStack<String> affIDL = new LinkedStack<>();
    static LinkedStack<String> openDaysL = new LinkedStack<>();
    static LinkedStack<String> openTimeStartL = new LinkedStack<>();
    static LinkedStack<String> openTimeEndL = new LinkedStack<>();
    static LinkedStack<String> foodIDL = new LinkedStack<>();
    static LinkedStack<String> foodNameL = new LinkedStack<>();
    static LinkedStack<String> foodDescL = new LinkedStack<>();
    static LinkedStack<String> foodPriceL = new LinkedStack<>();
    static LinkedStack<String> promotionPriceL = new LinkedStack<>();
    
    public static void main(String[] args) {
        while (leaveMenu.equals("y")){
            FoodMainMenu();
        }
    }
    
    public static void FoodMainMenu() {
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
        affID = sc.nextLine();
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
        foodID = String.format("f%03d", foodIDL.size() + 1);
        //foodID = "f001";
        System.out.println("Food ID\t\t: " + foodID);
        System.out.printf("Name\t\t: ");
        foodName = sc.nextLine();
        System.out.printf("Description\t: ");
        foodDesc = sc.nextLine();
        System.out.printf("Price(RM)\t\t: ");
        foodPrice = sc.nextLine();
        System.out.printf("Promotion price(RM)\t: ");
        promotionPrice = sc.nextLine();
        System.out.printf("Add foods?(y=yes,n=no)\t: ");
        toAddFood = sc.nextLine();
        
        foodIDL.push(foodID);
        foodNameL.push(foodName);
        foodDescL.push(foodDesc);
        foodPriceL.push(foodPrice);
        promotionPriceL.push(promotionPrice);
        affIDL.push(affID);
    }

    public static void EditFood() {
        System.out.printf("Enter food ID\t: ");
        foodID = sc.nextLine();
        System.out.printf("Name\t\t: ");
        foodName = sc.nextLine();
        System.out.printf("Description\t: ");
        foodDesc = sc.nextLine();
        System.out.printf("Price(RM)\t\t: ");
        foodPrice = sc.nextLine();
        System.out.printf("Promotion price(RM)\t: ");
        promotionPrice = sc.nextLine();
        System.out.printf("Edit more foods?(y=yes,n=no)\t: ");
        toEditFood = sc.nextLine();
    }
}
