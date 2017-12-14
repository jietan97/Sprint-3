/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleorders;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class ReadSchedule {
       private List<Schedule> mondayS = new ArrayList<>();
       
       private List<Schedule> tuesdayS = new ArrayList<>();
       private List<Schedule> wednesdayS = new ArrayList<>();
       private List<Schedule> thursdayS = new ArrayList<>();
       private List<Schedule> fridayS = new ArrayList<>();
       private Schedule displayM, displayT, displayW,displayTh,displayF;
       private String asd;
    public static void main(String[] args) {
         
        ReadSchedule read = new ReadSchedule();
        
        read.displayMonday();
        read.displayTuesday();
    }
    
    private void displayMonday(){
        try {
      ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("monday.dat"));
      mondayS = (ArrayList) (oiStream.readObject());
      oiStream.close();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
        
        System.out.print("Monday\n");
        for(int i=0;i<mondayS.size();i++)
       {
         
            displayM = mondayS.get(i);
            System.out.print(displayM);
       }
    }
    
    private void displayTuesday(){
        try {
      ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("tuesday.dat"));
      tuesdayS = (ArrayList) (oiStream.readObject());
      oiStream.close();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
        System.out.print("Tuesday\n");
        for(int i=0;i<tuesdayS.size();i++)
       {
         
            asd = tuesdayS.get(i).getRestaurant();
            System.out.print(asd);
       }
    }
    
    
}
