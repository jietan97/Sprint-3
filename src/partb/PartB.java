/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partb;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

/**
 *
 * @author Administrator
 */
public class PartB {

    private static List<deliveryManDetails> listDeliveryMan = new ArrayList<>();
    private static ListNode lstNode = new ListNode();
    private static List<deliveryManDetails> ll = new LinkedList<>();
    
            
    public static void main(String[] args) {
        // TODO code application logic here
        PartB partB = new PartB();
        
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int i = 0;
        String newDeliveryName = "";
        String gender;
        String icNo;
        String phoneNo;
        String homeAddress;
        String emergencyContact;
        double salary = 0.0;
        String status = "Full-Time";
        String typesOfFullTime;
        String yesNo;
        
        do { 
            System.out.println("\n" + (count + 1) + " Delivery Man");
            System.out.println("==============");
            
            System.out.print("Enter the New Delivery Man Name: ");
            newDeliveryName = scanner.nextLine();

            System.out.print("Enter your gender: ");
            gender = scanner.nextLine();
            
            System.out.print("Enter the IC Number: ");
            icNo = scanner.nextLine();

            System.out.print("Enter the Phone Number: ");
            phoneNo = scanner.nextLine();

            System.out.print("Enter the home address: ");
            homeAddress = scanner.nextLine();

            System.out.print("Enter the emergency Contact : ");
            emergencyContact = scanner.nextLine();
            
            System.out.print("Enter the salary (RM) : ");
            salary = scanner.nextDouble();
           
            scanner.nextLine();
            
            System.out.println("Status  : " + status);

            System.out.print("Types of Full Time : ");
            typesOfFullTime = scanner.nextLine();
            
            deliveryManDetails deliveryManDetails = new deliveryManDetails(newDeliveryName, gender, icNo, phoneNo, homeAddress, emergencyContact, salary, status, typesOfFullTime);
             

            lstNode.add(deliveryManDetails);
            ll.add(deliveryManDetails);
                       
            listDeliveryMan.add(deliveryManDetails); 
            count++;
            
             try {
            ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("deliveryManDetails.dat"));
            ooStream.writeObject(ll);
            ooStream.close();
          } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
          } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
            
            
            System.out.print("\nDo You want to continue to add new delivery man (yes / no): ");
            yesNo = scanner.nextLine();
 
        }while(yesNo.equals("yes") || yesNo.equals("y"));
 
        System.out.println("\n--------------------------------------------------------------");
        System.out.println("This below are showing that the records your are added");
        
        for (i = 0; i < ll.size(); i++) {
            System.out.println("\n==============");
            System.out.println((i + 1) + " delivery man");
            System.out.println("==============");
            System.out.println("Name               : " + lstNode);
     
        }
        
        
        System.out.println("\n\nAdd " + i + " number of delivery man Successful!!!\n");
        
    }
    
    
}
