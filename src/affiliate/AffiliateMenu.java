package affiliate;

import static affiliate.AffiliatesRegistration.*;
import static affiliate.affiliateReport.AffiliatesReport;
import static affiliate.deliverySchedule.loginPage;
import static affiliate.foodMenu.leaveMenu;
import java.io.IOException;
import java.util.Scanner;

public class AffiliateMenu {

    static Scanner sc = new Scanner(System.in);
    static String toAddAffiliates = "y";
    static boolean toExit = false;

    public static void main(String[] args) {
        affMenu();
    }

    public static void affMenu() {

        while (!toExit) {
            System.out.println("\n-- Fastest Deliveryman --\nAffiliates Menu\n====================================");
            System.out.print("1. Affiliate Resgistration\n"
                    + "2. Food Menu Management\n"
                    + "3. Add Additional Order\n"
                    + "4. Restaurant Summary Report\n"
                    + "0. Exit\n"
                    + "====================================\n"
                    + "Select the number : ");
            String affMenuChoice = sc.nextLine();

            switch (affMenuChoice) {
                case "1":
                    while (toAddAffiliates.equalsIgnoreCase("y")) {
                        affiliates = retrieveAffiliate();
                        AffiliatesReg();
                    }
                    System.out.println("Press Enter to Continue...");
                    sc.nextLine();
                    break;
                case "2":
                    while (leaveMenu.equals("y")) {
                        affiliate.foodMenu.FoodMainMenu();
                    }
                    System.out.println("Press Enter to Continue...");
                    sc.nextLine();
                    break;
                case "3":
                    try {
                        loginPage();
                    } catch (IOException ex) {
                        System.out.println("IOException");
                    } catch (ClassNotFoundException ex) {
                        System.out.println("ClassNotFoundException");
                    }
                    System.out.println("Press Enter to Continue...");
                    sc.nextLine();
                    break;
                case "4":
                    AffiliatesReport();
                    System.out.println("Press Enter to Continue...");
                    sc.nextLine();
                    break;
                case "0":
                    toExit = true;
                    break;
                default:
                    System.out.print("\nPlease select only 0 to 4");
                    break;
            }
        }
    }
}
