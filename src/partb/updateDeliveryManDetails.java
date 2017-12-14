/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partb;

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
 * @author user
 */
public class updateDeliveryManDetails {

    private static List<deliveryManDetails> listDeliveryMan = new ArrayList<>();
    private static String status;
    private static String typesOfFullTime;
        
    
    public static void main(String[] args) {       
        int select = mainMenu();
        String yesNo;
        Scanner scanner = new Scanner (System.in);
        if (select == 1) {
            do {
                updateContact();
                System.out.print("\nDo you want to continue to update delivery man contact information (yes / no): ");
                yesNo = scanner.nextLine();
                
            } while(yesNo.equals("yes") || yesNo.equals("y"));
        }
        else if (select == 2) {
            do {
                updateStatus();
                System.out.print("\nDo you want to continue to update delivery man status (yes / no): ");
                yesNo = scanner.nextLine();
            } while(yesNo.equals("yes") || yesNo.equals("y"));
        }        
        else if (select == 3) {
            displayPendingDeliveryMan();
        }   
        else if (select == 4) {
            
        }
    }
        
    public static int mainMenu() {       
        System.out.println("=========");
        System.out.println("Main Menu");
        System.out.println("=========");
        System.out.println("1. Update Delivery Man Contact Information (ContactNo, HomeAddress...)");
        System.out.println("2. Update Delivery Man Status(Resigned, Retired....)");
        System.out.println("3. Display the pending deliveries of each delivery msn");
        System.out.println("4. Exit");
        System.out.print("\nPlease select the number you want to do : ");
        
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        
        
        return select;
        
    } 
    
    public static void updateContact() {
        Scanner scanner = new Scanner(System.in);
        try {
              ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("deliveryManDetails.dat"));
              listDeliveryMan = (ArrayList) (oiStream.readObject());
              oiStream.close();
            } catch (FileNotFoundException ex) {
              JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
              JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        
        for (int i = 0; i < listDeliveryMan.size(); i++) {
            System.out.println("\n\n==============");
            System.out.println((i + 1) + " delivery man");
            System.out.println("==============");
            System.out.println("Name               : " + listDeliveryMan.get(i).getNewDeliveryName());
            System.out.println("Gender             : " + listDeliveryMan.get(i).getGender());
            System.out.println("IC Number          : " + listDeliveryMan.get(i).getIcNo());
            System.out.println("Phone No           : " + listDeliveryMan.get(i).getPhoneNo());
            System.out.println("Home Address       : " + listDeliveryMan.get(i).getHomeAddress());
            System.out.println("Emergency Contact  : " + listDeliveryMan.get(i).getEmergencyContact());
            System.out.printf("Salary             : %.2f\n", listDeliveryMan.get(i).getSalary());                      
            System.out.println("Status             : " + listDeliveryMan.get(i).getStatus());
            System.out.println("Types of Full Time : " + listDeliveryMan.get(i).getTypesOfFullTime());    
        }
        
        System.out.print("\nPlease select that delivery man you want to update : ");
        int noDeliveryMan = scanner.nextInt();

        String phoneNo;
        String homeAddress;
        String emergencyContact;
        
        System.out.println("1. Phone No ");
        System.out.println("2. Home Address ");
        System.out.println("3. Emergency Contact ");
        System.out.println("4. All (Phone No, Home Address, Emergency Contact) ");
        System.out.print("\nPlease select that details you want to update : ");
        int select = scanner.nextInt();
        
        if (select == 1) {
            for (int i = 0; i < listDeliveryMan.size(); i++) {
                if (noDeliveryMan == (i + 1)) {
                    System.out.println("Name               : " + listDeliveryMan.get(i).getNewDeliveryName());
                    System.out.println("Gender             : " + listDeliveryMan.get(i).getGender());
                    System.out.println("IC Number          : " + listDeliveryMan.get(i).getIcNo());
                    
                    System.out.print("Phone No           : " );
                    scanner.nextLine();
                    phoneNo = scanner.nextLine();
                    listDeliveryMan.get(i).setPhoneNo(phoneNo);
                    
                    System.out.println("Home Address       : " + listDeliveryMan.get(i).getHomeAddress());      
                    System.out.println("Emergency Contact  : " + listDeliveryMan.get(i).getEmergencyContact());
                    System.out.printf("Salary             : %.2f\n", listDeliveryMan.get(i).getSalary());  
                    System.out.println("Status             : " + listDeliveryMan.get(i).getStatus());
                    System.out.println("Types of Full Time : " + listDeliveryMan.get(i).getTypesOfFullTime());    
                }
            }
        }
        
        if (select == 2) {
            for (int i = 0; i < listDeliveryMan.size(); i++) {
                if (noDeliveryMan == (i + 1)) {
                    System.out.println("Name               : " + listDeliveryMan.get(i).getNewDeliveryName());
                    System.out.println("Gender             : " + listDeliveryMan.get(i).getGender());
                    System.out.println("IC Number          : " + listDeliveryMan.get(i).getIcNo());
                    System.out.println("Phone No           : " + listDeliveryMan.get(i).getPhoneNo());
                    
                    System.out.print("Home Address       : " );
                    scanner.nextLine();
                    homeAddress = scanner.nextLine();
                    listDeliveryMan.get(i).setHomeAddress(homeAddress);
                    
                    
                    System.out.println("Emergency Contact  : " + listDeliveryMan.get(i).getEmergencyContact());
                    System.out.printf("Salary             : %.2f\n", listDeliveryMan.get(i).getSalary());  
                    System.out.println("Status             : " + listDeliveryMan.get(i).getStatus());
                    System.out.println("Types of Full Time : " + listDeliveryMan.get(i).getTypesOfFullTime());    
                }
            }
        }
        
        if (select == 3) {
            for (int i = 0; i < listDeliveryMan.size(); i++) {
                if (noDeliveryMan == (i + 1)) {
                    System.out.println("Name               : " + listDeliveryMan.get(i).getNewDeliveryName());
                    System.out.println("Gender             : " + listDeliveryMan.get(i).getGender());
                    System.out.println("IC Number          : " + listDeliveryMan.get(i).getIcNo());
                    System.out.println("Phone No           : " + listDeliveryMan.get(i).getPhoneNo());
                    System.out.println("Home Address       : " + listDeliveryMan.get(i).getHomeAddress());
                    
                    System.out.print("Emergency Contact  : " );
                    scanner.nextLine();
                    emergencyContact = scanner.nextLine();
                    listDeliveryMan.get(i).setEmergencyContact(emergencyContact);

                    System.out.printf("Salary             : %.2f\n", listDeliveryMan.get(i).getSalary());   
                    System.out.println("Status             : " + listDeliveryMan.get(i).getStatus());
                    System.out.println("Types of Full Time : " + listDeliveryMan.get(i).getTypesOfFullTime());    
                }
            }
        }
        
        if (select == 4) {
            for (int i = 0; i < listDeliveryMan.size(); i++) {
                if (noDeliveryMan == (i + 1)) {
                    System.out.println("Name               : " + listDeliveryMan.get(i).getNewDeliveryName());
                    System.out.println("Gender             : " + listDeliveryMan.get(i).getGender());
                    System.out.println("IC Number          : " + listDeliveryMan.get(i).getIcNo());

                    System.out.print("Phone No           : " );
                    scanner.nextLine();
                    phoneNo = scanner.nextLine();
                    listDeliveryMan.get(i).setPhoneNo(phoneNo);

                    System.out.print("Home Address       : " );
                    homeAddress = scanner.nextLine();
                    listDeliveryMan.get(i).setHomeAddress(homeAddress);

                    System.out.print("Emergency Contact  : " );
                    emergencyContact = scanner.nextLine();
                    listDeliveryMan.get(i).setEmergencyContact(emergencyContact);

                    System.out.printf("Salary            : %.2f\n", listDeliveryMan.get(i).getSalary());  
                    System.out.println("Status             : " + listDeliveryMan.get(i).getStatus());
                    System.out.println("Types of Full Time : " + listDeliveryMan.get(i).getTypesOfFullTime());    
                }
            }
        }
           
        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("deliveryManDetails.dat"));
            ooStream.writeObject(listDeliveryMan);
            ooStream.close();
          } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
          } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
                
    }
    
    public static void updateStatus() {
        Scanner scanner = new Scanner(System.in);
        try {
              ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("deliveryManDetails.dat"));
              listDeliveryMan = (ArrayList) (oiStream.readObject());
              oiStream.close();
            } catch (FileNotFoundException ex) {
              JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
              JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        
        for (int i = 0; i < listDeliveryMan.size(); i++) {
            System.out.println("\n\n==============");
            System.out.println((i + 1) + " delivery man");
            System.out.println("==============");
            System.out.println("Name               : " + listDeliveryMan.get(i).getNewDeliveryName());
            System.out.println("Gender             : " + listDeliveryMan.get(i).getGender());
            System.out.println("IC Number          : " + listDeliveryMan.get(i).getIcNo());
            System.out.println("Phone No           : " + listDeliveryMan.get(i).getPhoneNo());
            System.out.println("Home Address       : " + listDeliveryMan.get(i).getHomeAddress());
            System.out.println("Emergency Contact  : " + listDeliveryMan.get(i).getEmergencyContact());
            System.out.printf("Salary             : %.2f\n", listDeliveryMan.get(i).getSalary());                      
            System.out.println("Status             : " + listDeliveryMan.get(i).getStatus());
            System.out.println("Types of Full Time : " + listDeliveryMan.get(i).getTypesOfFullTime());    
        }
        
        System.out.print("\nPlease select that delivery man you want to update : ");
        int noDeliveryMan = scanner.nextInt();

        
        System.out.println("\nUpdate the Status of delivery man : ");
        System.out.println("======================================");
            for (int i = 0; i < listDeliveryMan.size(); i++) {
                if (noDeliveryMan == (i + 1)) {
                    System.out.println("Name               : " + listDeliveryMan.get(i).getNewDeliveryName());
                    System.out.println("Gender             : " + listDeliveryMan.get(i).getGender());
                    System.out.println("IC Number          : " + listDeliveryMan.get(i).getIcNo());      
                    System.out.println("Phone No           : " + listDeliveryMan.get(i).getPhoneNo());           
                    System.out.println("Home Address       : " + listDeliveryMan.get(i).getHomeAddress());      
                    System.out.println("Emergency Contact  : " + listDeliveryMan.get(i).getEmergencyContact());
                    System.out.printf("Salary             : %.2f\n", listDeliveryMan.get(i).getSalary()); 
                    
                    System.out.print("Status             : ");
                    scanner.nextLine();
                    status = scanner.nextLine();
                    listDeliveryMan.get(i).setStatus(status);
                    
                    System.out.println("Types of Full Time : " + listDeliveryMan.get(i).getTypesOfFullTime());    
                }
            }
        
        
        try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("deliveryManDetails.dat"));
            ooStream.writeObject(listDeliveryMan);
            ooStream.close();
          } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
          } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
        
    }
    
    public static void displayPendingDeliveryMan() {
        
        try {
              ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("deliveryManDetails.dat"));
              listDeliveryMan = (ArrayList) (oiStream.readObject());
              oiStream.close();
            } catch (FileNotFoundException ex) {
              JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
              JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
              
        for (int i = 0; i < listDeliveryMan.size(); i++) {
            if (listDeliveryMan.get(i).getStatus().equals("Full-Time") && listDeliveryMan.get(i).getTypesOfFullTime().equals("Available")) {
                System.out.println("\n\n==============");
                System.out.println((i + 1) + " delivery man");
                System.out.println("==============");
                System.out.println("Name               : " + listDeliveryMan.get(i).getNewDeliveryName());
                System.out.println("Gender             : " + listDeliveryMan.get(i).getGender());
                System.out.println("IC Number          : " + listDeliveryMan.get(i).getIcNo());
                System.out.println("Phone No           : " + listDeliveryMan.get(i).getPhoneNo());
                System.out.println("Home Address       : " + listDeliveryMan.get(i).getHomeAddress());
                System.out.println("Emergency Contact  : " + listDeliveryMan.get(i).getEmergencyContact());
                System.out.printf("Salary             : %.2f\n", listDeliveryMan.get(i).getSalary());                      
                System.out.println("Status             : " + listDeliveryMan.get(i).getStatus());
                System.out.println("Types of Full Time : " + listDeliveryMan.get(i).getTypesOfFullTime());    
            }
        }
    }
    
}
