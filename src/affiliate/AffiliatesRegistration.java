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
//import adt.LinkedStack;
import adt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class AffiliatesRegistration {

    //static LinkedStack<String> ls = new LinkedStack<>();
    static AffiliateClass as = new AffiliateClass();
    static Scanner sc = new Scanner(System.in);
    //static String userID, password, rpassword, passwordHit, name, restaurantName, email,icno, phoneNo, address1, address2, city, state, zipCode;
    static String toAddAffiliates = "y";
//    static LinkedStack<AffiliateClass> affiliates = new LinkedStack<>();
    static ListInterface<AffiliateClass> affiliates = new LList<>();
//    static LinkedStack<AffiliateClass> affiliates2 = new LinkedStack<>();
//    static LinkedStack<String> userIDL = new LinkedStack<>();
//    static LinkedStack<String> restaurantNameL = new LinkedStack<>();
//    static LinkedStack<String> nameL = new LinkedStack<>();
//    static LinkedStack<String> emailL = new LinkedStack<>();
//    static LinkedStack<String> passwordL = new LinkedStack<>();
//    static LinkedStack<String> passwordHitL = new LinkedStack<>();
//    static LinkedStack<String> icnoL = new LinkedStack<>();
//    static LinkedStack<String> phoneNoL = new LinkedStack<>();
//    static LinkedStack<String> address1L = new LinkedStack<>();
//    static LinkedStack<String> address2L = new LinkedStack<>();
//    static LinkedStack<String> cityL = new LinkedStack<>();
//    static LinkedStack<String> stateL = new LinkedStack<>();
//    static LinkedStack<String> zipCodeL = new LinkedStack<>();
//    static String userIDL, passwordL, rpasswordL, passwordHitL, nameL, restaurantNameL, emailL,icnoL, phoneNoL, address1L, address2L, cityL, stateL, zipCodeL; 
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        AffiliateClass ac = new AffiliateClass(userIDL, passwordL, rpasswordL, passwordHitL, nameL, restaurantNameL, emailL,icnoL, phoneNoL, address1L, address2L, cityL, stateL, zipCodeL);
        //AffiliatesRegistration ar = new AffiliatesRegistration();
        while (toAddAffiliates.equals("y")) {
            affiliates = retrieveAffiliate();
            AffiliatesReg();
            saveAffiliate();
        }
        
    }

    public static void AffiliatesReg() throws IOException, ClassNotFoundException {
        //menu start
        System.out.println("\n-- Fastest Deliveryman --\nAffiliates Registration\n====================================");
        //as.userID = String.format("aff%03d", affiliates.size() + 1);
        as.userID = String.format("aff%03d", affiliates.getNumberOfEntries() + 1);
        System.out.println("Restaurant ID\t: " + as.userID);
        //userID = sc.next();
        do {
            System.out.printf("Password\t: ");
            //password = sc.next();
            as.password = sc.next();
            //password = as.getPassword();
            System.out.printf("Retry password\t: ");
            as.rpassword = sc.next();

            if (!as.password.equals(as.rpassword)) {
                System.out.println("\n**Please try the correct password!**");
            }
        } while (!as.password.equals(as.rpassword));

        System.out.printf("Password Hit\t: ");
        sc.nextLine();
        //for recovery
        as.passwordHit = sc.nextLine();
        //Restaurant Information
        System.out.println("\nRestaurant Information\n====================================");
        System.out.printf("Restaurant name\t: ");
        as.restaurantName = sc.nextLine();
        System.out.printf("Owner's name\t: ");
        as.name = sc.nextLine();
        System.out.printf("IC number - e.g.(011111011111)\n * 16-digits\t: ");
        as.icno = sc.nextLine();
        System.out.printf("Tel number - e.g.(0123456789)\n * 10-11 digits\t: ");
        as.phoneNo = sc.nextLine();
        System.out.printf("Email\t\t: ");
        as.email = sc.nextLine();
        System.out.printf("Address\nline 1\t\t: ");
        as.address1 = sc.nextLine();
        System.out.printf("line 2\t\t: ");
        as.address2 = sc.nextLine();
        System.out.printf("Zip code\t: ");
        as.zipCode = sc.nextLine();
        System.out.printf("City\t\t: ");
        as.city = sc.nextLine();
        System.out.printf("State\t\t: ");
        as.state = sc.nextLine();
        System.out.printf("Are you sure (y=yes, n=no)\t : ");

        if (sc.nextLine().equals("y")) {
            affiliates.add(as);
            showStaffInfo();
        } else {
            System.out.println("Data unsaved.");
            //break;
        }

        
        
//        userIDL.push(as.userID);
//        restaurantNameL.push(as.restaurantName);
//        nameL.push(as.name);
//        passwordL.push(as.password);
//        passwordHitL.push(as.passwordHit);
//        icnoL.push(as.icno);
//        phoneNoL.push(as.phoneNo);
//        emailL.push(as.email);
//        address1L.push(as.address1);
//        address2L.push(as.address2);
//        cityL.push(as.city);
//        stateL.push(as.state);
//        zipCodeL.push(as.zipCode);

        //System.out.println("User ID\t: " + userIDL);
        System.out.printf("====================================\nDo You want to add more affiliates?(y=yes, n=no): ");
        toAddAffiliates = sc.nextLine();
    }

    public static void showStaffInfo() throws IOException, ClassNotFoundException {
        //affiliates2 = retrieveAffiliate();
        
        System.out.println("\nRegistration Success\n====================================");
        System.out.println("Restaurant ID\t: " + as.userID);
        System.out.println("The restaurant " + as.restaurantName + " has been registed.\n");
        System.out.println("Owner's name\t: " + as.name);
        System.out.println("IC number\t: " + as.icno);
        System.out.println("Tel number\t: " + as.phoneNo);
        System.out.println("Email\t\t: " + as.email);
        System.out.println("Address\t\t: \n\t" + as.address1 + "\n\t" + as.address2 + "\n\t" + as.zipCode + " " + as.city + "\n\t" + as.state + "\n");
        System.out.println("====================================\n*Please remember your USER ID and PASSWORD!!*");
//        saveAffiliate();
    }

    public static class affiliateStream implements Serializable {

        public String userID = null;
        public String password = null;
        //public String rpassword = null;
        public String passwordHit = null;
        public String name = null;
        public String restaurantName = null;
        public String email = null;
        public String icno = null;
        public String phoneNo = null;
        public String address1 = null;
        public String address2 = null;
        public String city = null;
        public String state = null;
        public String zipCode = null;
    }

    public static void saveAffiliate() {
        
        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("affiliate.dat"));
            ooStream.writeObject(affiliates);
            ooStream.close();
          } catch (FileNotFoundException ex) {
            System.out.println("FileNotFoundException");
          } catch (IOException ex) {
              System.out.println(ex.getMessage());
            System.out.println("IOException");
          }
    }

//    public static void readAffiliate() throws IOException, ClassNotFoundException {
//        try {
//            ObjectInputStream affiliateInputStream
//                    = new ObjectInputStream(new FileInputStream("affiliate.dat"));
//
//            affiliateStream affS = (affiliateStream) affiliateInputStream.readObject();
//            affiliateInputStream.close();
//            System.out.println("\nRegistration Success\n====================================");
//            System.out.println("Restaurant ID\t: " + affS.userID);
//            System.out.println("Restaurant\t: " + affS.restaurantName + "\n");
//            System.out.println("Owner's name\t: " + affS.name);
//            System.out.println("IC number\t: " + affS.icno);
//            System.out.println("Tel number\t: " + affS.phoneNo);
//            System.out.println("Email\t\t: " + affS.email);
//            System.out.println("Address\t\t: \n\t" + affS.address1 + "\n\t" + affS.address2 + "\n\t" + affS.zipCode + " " + affS.city + "\n\t" + affS.state + "\n");
//        } catch (FileNotFoundException ex) {
//            System.out.println("\n-- Fastest Deliveryman --\nAffiliate Details\n====================================");
//            System.out.println("No record");
//        }
//    }
    
    public static ListInterface<AffiliateClass> retrieveAffiliate() {
         try {
              ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("affiliate.dat"));
              affiliates = (ListInterface<AffiliateClass>) (oiStream.readObject());
              oiStream.close();
            } catch (FileNotFoundException ex) {
              System.out.println("FileNotFoundException");
            } catch (IOException ex) {
              System.out.println("IOException");
            } catch (ClassNotFoundException ex) {
              System.out.println("ClassNotFoundException");
            }
         return affiliates;
    }
}
