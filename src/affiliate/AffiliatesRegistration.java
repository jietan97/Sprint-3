/*
Auther : Tan Kai Lun
Group 10
Member group 3 part A
Task ID : 152569170
User story : As a restaurant owner, I want register as an affiliates, so that I can maintain the food menu.
*/
package affiliate;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

public class AffiliatesRegistration {
    //static LinkedStack<String> ls = new LinkedStack<>();
    static AffiliateClass as = new AffiliateClass();
    static Scanner sc = new Scanner(System.in);
    static String userID, password, rpassword, passwordHit, name, restaurantName, email,icno, phoneNo, address1, address2, city, state, zipCode;
    static String toAddAffiliates = "y";
    
    static LinkedStack<String> userIDL = new LinkedStack<>();
    static LinkedStack<String> restaurantNameL = new LinkedStack<>();
    static LinkedStack<String> nameL = new LinkedStack<>();
    static LinkedStack<String> emailL = new LinkedStack<>();
    static LinkedStack<String> passwordL = new LinkedStack<>();
    static LinkedStack<String> passwordHitL = new LinkedStack<>();
    static LinkedStack<String> icnoL = new LinkedStack<>();
    static LinkedStack<String> phoneNoL = new LinkedStack<>();
    static LinkedStack<String> address1L = new LinkedStack<>();
    static LinkedStack<String> address2L = new LinkedStack<>();
    static LinkedStack<String> cityL = new LinkedStack<>();
    static LinkedStack<String> stateL = new LinkedStack<>();
    static LinkedStack<String> zipCodeL = new LinkedStack<>();

    public static void main(String[] args) {
        
        //AffiliatesRegistration ar = new AffiliatesRegistration();
        while (toAddAffiliates.equals("y")) {
            AffiliatesReg();
        }
    }

    public static void AffiliatesReg() {
        //menu start
        System.out.println("\n-- Fastest Deliveryman --\nAffiliates Registration\n====================================");
        userID = String.format("aff%03d", userIDL.size() + 1);
        System.out.println("Restaurant ID\t: " + userID);
        //userID = sc.next();
        do{
            System.out.printf("Password\t: ");
            password = sc.next();
            System.out.printf("Retry password\t: ");
            rpassword = sc.next();
            
            if (!password.equals(rpassword)){
                System.out.println("\n**Please try the correct password!**");
            }
        }while(!password.equals(rpassword));
        
        System.out.printf("Password Hit\t: ");
        sc.nextLine();
        //for recovery
        passwordHit = sc.nextLine();
        //Restaurant Information
        System.out.println("\nRestaurant Information\n====================================");
        System.out.printf("Restaurant name\t: ");
        restaurantName = sc.nextLine();
        System.out.printf("Owner's name\t: ");
        name = sc.nextLine();
        System.out.printf("IC number - e.g.(011111011111)\n * 16-digits\t: ");
        icno = sc.nextLine();
        System.out.printf("Tel number - e.g.(0123456789)\n * 10-11 digits\t: ");
        phoneNo = sc.nextLine();
        System.out.printf("Email\t\t: ");
        email = sc.nextLine();
        System.out.printf("Address\nline 1\t\t: ");
        address1 = sc.nextLine();
        System.out.printf("line 2\t\t: ");
        address2 = sc.nextLine();
        System.out.printf("Zip code\t: ");
        zipCode = sc.nextLine();
        System.out.printf("City\t\t: ");
        city = sc.nextLine();
        System.out.printf("State\t\t: ");
        state = sc.nextLine();
        System.out.printf("Are you sure (y=yes, n=no)\t : ");

        if (sc.nextLine().equals("y")) {
            showStaffInfo();
        } else {
            System.out.println("Data unsaved.");
            //break;
        }

        userIDL.push(userID);
        restaurantNameL.push(restaurantName);
        nameL.push(name);
        passwordL.push(password);
        passwordHitL.push(passwordHit);
        icnoL.push(icno);
        phoneNoL.push(phoneNo);
        emailL.push(email);
        address1L.push(address1);
        address2L.push(address2);
        cityL.push(city);
        stateL.push(state);
        zipCodeL.push(zipCode);

        //System.out.println("User ID\t: " + userIDL);
        System.out.printf("====================================\nDo You want to add more affiliates?(y=yes, n=no): ");
        toAddAffiliates = sc.nextLine();
    }

    public static void showStaffInfo() {
        System.out.println("\nRegistration Success\n====================================");
        System.out.println("Restaurant ID\t: " + userID);
        System.out.println("The restaurant " + restaurantName + " has been registed.\n");
        System.out.println("Owner's name\t: " + name);
        System.out.println("IC number\t: " + icno);
        System.out.println("Tel number\t: " + phoneNo);
        System.out.println("Email\t\t: " + email);
        System.out.println("Address\t\t: \n\t" + address1 + "\n\t" + address2 + "\n\t" + zipCode + " " + city + "\n\t" + state + "\n");
        System.out.println("====================================\n*Please remember your USER ID and PASSWORD!!*");
    }
}
