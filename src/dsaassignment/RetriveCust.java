/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsaassignment;

/**
 *
 * @author Ong Chong Ren
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.JOptionPane;

public class RetriveCust {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        mainMenu();

    }

    private static int choice = 0;

    private static String name;
    private static String gender;
    private static String homeAddress;
    private static String phoneNumber;
    private static String option;
    private static List<Customer> customerList = new ArrayList<>();

    public static void mainMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Fastest Deliverymen's ");
        System.out.println("1.Add Customer Record ");
        System.out.println("2.Retrieve Customer Record ");
        System.out.print("Choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                addCustomerRecord();
                break;
            case 2:
                retriveCustomerRecord();
                break;
            default:
                System.out.println("Please select 1 to 2");
                break;
        }

    }

    private static void addCustomerRecord() {

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your name: ");
            name = sc.nextLine();
            System.out.println("Please enter your gender: ");
            gender = sc.nextLine();
            System.out.println("Please enter your home address: ");
            homeAddress = sc.nextLine();
            System.out.println("Please enter your phone number: ");
            phoneNumber = sc.nextLine();

            System.out.print("\nDo You want to continue to add new customer detail ? (yes / no): ");
            option = sc.nextLine();

        } while (option.equals("yes") || option.equals("y"));

        Customer customerDetails = new Customer(name, gender, homeAddress, phoneNumber);
        customerList.add(customerDetails);
        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("Customer.dat"));
            ooStream.writeObject(customerList);
            ooStream.close();

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }

    private static void retriveCustomerRecord() {
        try {
            ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("Customer.dat"));
            customerList = (ArrayList) (oiStream.readObject());
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
            System.out.println("Please enter you phone number : ");
            phoneNumber = sc.nextLine();
            for (int i = 0; i < customerList.size(); i++) {

                if (customerList.get(i).getPhoneNumber().equals(phoneNumber)) {

                    System.out.println("Name:" + customerList.get(i).getName());
                    System.out.println("Gender: " + customerList.get(i).getGender());
                    System.out.println("Home Address:" + customerList.get(i).getHomeAddress());
                    System.out.println("Phone Number:" + customerList.get(i).getPhoneNumber());

                } else {
                    System.out.println(" Wrong number please try again.");

                }

            }
            System.out.print("\nDo You want to continue to retrieve customer detail ? (yes / no): ");
            option = sc.nextLine();

        } while (option.equals("yes") || option.equals("y"));
    }

}
