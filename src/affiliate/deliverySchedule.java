package affiliate;

/*
Auther : Tan Kai Lun
Group 10
Member group 3 part A
Task ID : 152569114
User story : As a manager, I want to generate food delivery schedule, so that delivery man can delivery properly.
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class deliverySchedule {
    static Scanner sc = new Scanner(System.in);
    static int orderCount = 1;
    static String toAddDelivery = "y";
    static String quit = "f";
    
    static deliveryClass dc = new deliveryClass();
    
    public static void main(String[] args) {
//        try {
//            loginPage();
//        } catch (IOException ex) {
//            System.out.println("IOException");
//        } catch (ClassNotFoundException ex) {
//            System.out.println("ClassNotFoundException");
//        }
    }
    
    public static void loginPage() throws IOException, ClassNotFoundException {
        System.out.println("\n-- Fastest Deliveryman --\nDelivery\n====================================");
        System.out.printf("Enter Restaurant ID\t: ");
        dc.userID = sc.next();
        System.out.printf("Password\t\t: ");
        dc.password = sc.next();
        while(quit.equals("f")){
            deliveryMenu();
        }
    }
    
    public static void deliveryMenu() throws IOException, ClassNotFoundException {
        System.out.println("\n-- Fastest Deliveryman --\nDelivery\n====================================");
        System.out.printf("Restaurant ID %s\n\n", dc.userID);
        System.out.println("1.\tCurrent delivery details");
        System.out.println("2.\tAdd delivery details");
        System.out.println("3.\tEdit delivery details");
        System.out.println("4.\tRemove delivery details");
        System.out.printf("Enter number : ");
        dc.mainC = sc.next();
        switch(dc.mainC) {
        case "1":
            currentDelivery();
            break;
        case "2":
            while(toAddDelivery.equals("y")){
                addDelivery();
            }
            break;
        case "3":
            editDelivery();
            break;
        case "4":
            deleteDelivery();
            break;
        default:
            System.out.printf("none");
        } 
    }
    
    public static void currentDelivery() throws IOException, ClassNotFoundException {
        readDelivery();
    }
    
    public static void addDelivery() throws IOException, ClassNotFoundException {
        System.out.println("\n-- Fastest Deliveryman --\nNew Delivery\n====================================");
        dc.orderID = String.format("od%05d", orderCount);
        System.out.println("Order ID\t: " + dc.orderID);
        System.out.printf("Customer name\t: ");
        sc.nextLine();
        dc.cname = sc.nextLine();
        System.out.printf("Contact number - e.g.(0123456789)\n * 10-11 digits\t: ");
        dc.cphoneNo = sc.next();
        System.out.printf("Address\nline 1\t\t: ");
        sc.nextLine();
        dc.caddress1 = sc.nextLine();
        System.out.printf("line 2\t\t: ");
        dc.caddress2 = sc.nextLine();
        System.out.printf("Zip code\t: ");
        dc.czipCode = sc.nextLine();
        System.out.printf("City\t\t: ");
        dc.ccity = sc.nextLine();
        System.out.printf("State\t\t: ");
        dc.cstate = sc.nextLine();
        System.out.printf("Payment status (1=paid, 2=un pay): ");
        dc.cpaymentStatus = sc.next();
        if (dc.cpaymentStatus.equals("2")) {
            System.out.printf("Enter the price need to pay ");
            sc.next();
        }
        System.out.printf("Are you sure to add this record? (y=yes, n=no)\t : ");
        sc.nextLine();
        if (sc.nextLine().equals("y")) {
            orderCount++;
            saveDelivery();
            showDeliveryDetails();
        } else {
            System.out.println("Data unsaved.");
            //break;
        }
        
        System.out.printf("====================================\nDo You want to add more record?(y=yes, n=no): ");
        toAddDelivery = sc.next();
    }
    
    public static void showDeliveryDetails() {
        System.out.println("\nRecord add Success\n====================================");
        System.out.println("Order ID\t: " + dc.orderID);
        System.out.println("Customer\t: " + dc.cname);
        System.out.println("Tel number\t: " + dc.cphoneNo);
        System.out.println("Address\t\t: \n\t" + dc.caddress1 + "\n\t" + dc.caddress2 + "\n\t" + dc.czipCode + " " + dc.ccity + "\n\t" + dc.cstate + "\n");
        System.out.println("====================================\n*The order will send in 30 minutes*");
    }
    
    public static void editDelivery() {
        System.out.printf("3");
    }
    
    public static void deleteDelivery() {
        System.out.printf("4");
    }
    
    public static class Order implements Serializable {
        public String ID = null;
        public String name = null;
        public String phoneNo = null;
        public String address1 = null;
        public String address2 = null;
        public String address3 = null;
        public String zipCode = null;
        public String city = null;
        public String state = null;
        public String paymentStatus = null;
    }
    
    public static void saveDelivery() throws IOException, ClassNotFoundException{
        ObjectOutputStream orderOutputStream =
            new ObjectOutputStream(new FileOutputStream("order.dat"));
        
        Order order = new Order();
        order.ID = dc.orderID;
        order.name = dc.cname;
        order.phoneNo = dc.cphoneNo;
        order.address1 = dc.caddress1;
        order.address2 = dc.caddress2;
        order.zipCode = dc.czipCode;
        order.city = dc.ccity;
        order.state = dc.cstate;
        order.paymentStatus = dc.cpaymentStatus;
        
        orderOutputStream.writeObject(order);
        orderOutputStream.close();
    }
    
    public static void readDelivery() throws IOException, ClassNotFoundException{
        try {
            ObjectInputStream orderInputStream =
                new ObjectInputStream(new FileInputStream("order.dat"));

            Order or = (Order) orderInputStream.readObject();
            orderInputStream.close();
            System.out.println("\n-- Fastest Deliveryman --\nCurrent Delivery\n====================================");
            System.out.println("Order ID\t: " + or.ID);
            System.out.println("Customer\t: " + or.name);
            System.out.println("Tel number\t: " + or.phoneNo);
            System.out.println("Payment status\t: " + or.paymentStatus);
            System.out.println("Address\t\t: \n\t" + or.address1 + "\n\t" + or.address2 + "\n\t" + or.zipCode + " " + or.city + "\n\t" + or.state + "\n\n");
        } catch (FileNotFoundException ex) {
            System.out.println("\n-- Fastest Deliveryman --\nCurrent Delivery\n====================================");
            System.out.println("No record");
        } 
    }
}