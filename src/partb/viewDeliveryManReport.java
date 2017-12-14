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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class viewDeliveryManReport {

    /**
     * @param args the command line arguments
     */
    
    private static List<deliveryManDetails> listDeliveryManReport = new ArrayList<>();
    private static int totalDeliveredDone = 0;
    private static int totalTravel = 0;
    
    public static void main(String[] args) {
        try {
              ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("deliveryManReport.dat"));
              listDeliveryManReport = (ArrayList) (oiStream.readObject());
              oiStream.close();
            } catch (FileNotFoundException ex) {
              JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
              JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (ClassNotFoundException ex) {
              JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate currentDate = LocalDate.now();
        
        System.out.println("Daily Report on " + dtf.format(currentDate));
        System.out.println("--------------------------\n");
        System.out.println("    Report about delivered have done and total distance of Delivery Man per day");
        System.out.println("========================================================================================");
        System.out.println("No.\t Name\t\t\tDelivered Done Per Day\t\tTotal Travel Per Day(KM)");
        System.out.println("========================================================================================");
        for (int i = 0; i < listDeliveryManReport.size(); i++) {           
            System.out.printf("%2d \t %-15s \t\t %-12d  %20d\n" ,(i + 1), listDeliveryManReport.get(i).getNewDeliveryName(), listDeliveryManReport.get(i).getDeliveredDonePerDay(), listDeliveryManReport.get(i).getTotalTravelPerDay());
            
            totalDeliveredDone += listDeliveryManReport.get(i).getDeliveredDonePerDay();
            totalTravel += listDeliveryManReport.get(i).getTotalTravelPerDay();
            
        }
        
        System.out.println("------------------------------------------------------------------------------------");
        System.out.printf("\t Total Per Daily \t\t %-2d \t\t\t %10d\n", totalDeliveredDone, totalTravel);
        System.out.println("------------------------------------------------------------------------------------");
    }
    
}
