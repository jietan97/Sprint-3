/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package partb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class addReport {

    /**
     * @param args the command line arguments
     */
    
    private static List<deliveryManDetails> listDeliveryMan = new ArrayList<>();
    private static String status;
      
    public static void main(String[] args) {
        // TODO code application logic here
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
