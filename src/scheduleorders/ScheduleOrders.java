/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scheduleorders;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class ScheduleOrders {
 
    private List<Schedule> mondayS = new ArrayList<>();
    private List<Schedule> tuesdayS = new ArrayList<>();
    private List<Schedule> wednesdayS = new ArrayList<>();
    private List<Schedule> thursdayS = new ArrayList<>();
    private List<Schedule> fridayS = new ArrayList<>();
    private String [] restaurantN = new String []{"Sushi King","KFC","Macdonald","Kenny Roger Roster"};
    private Scanner scanner = new Scanner (System.in);
   

    public static void main(String[] args) {
       
        ScheduleOrders menu = new ScheduleOrders();
        menu.role();
       
    }
    
    public void role(){
        System.out.println("\nChoose Your Role ");
        System.out.println("1. Customer");
        System.out.println("2. Delivery Man");
        System.out.print("Please choose your choice:");
        int choice = scanner.nextInt();
        
        if(choice == 1)
        {
            mainMenu();
        }
        else if(choice == 2)
        {
            deliveryMenu();
        }    
    }
    public void mainMenu(){
        System.out.println("\nMain Menu ");
        System.out.println("1. Make Schedule Orders");
        System.out.println("2. Update Schedule Orders");
        System.out.println("3. Cancel Schedule Orders");
        System.out.println("4. Exit");
        System.out.print("Please choose your choice:");
        int choice = scanner.nextInt();
        
        if(choice == 1)
        {
            menu();
        }
        else if(choice == 2)
        {
            updateSchedule();
        }
        else if(choice == 3)
        {
            cancelSchedule();
        }
        else
        {
            role();
        }
    }
    
    public void deliveryMenu(){
        System.out.println("\nMain Menu ");
        System.out.println("1. Display Schedule Orders");
        System.out.print("Please choose your choice:");
        int choice = scanner.nextInt();
        
        if(choice == 1)
        {
            displayMenu();
        }
        
    }
    
    public void menu(){
        System.out.println("\nMake Schedule Orders: ");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.print("Please choose your choice:");
        int choice = scanner.nextInt();
        
        if(choice == 1)
        {
            mondaySchedule();
        }
        else if(choice == 2)
        {
            tuesdaySchedule();
        }    
        else if(choice == 3)
        {
            wednesdaySchedule();
        }
        else if(choice == 4)
        {
           thursdaySchedule();
        }
        else if(choice == 5)
        {
            fridaySchedule();
        }
        else 
        {
            System.exit(1);
        }
    }
    
    public void mondaySchedule(){
        String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
        char ans;
        
        System.out.println("\nMonday Schedule");
        System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        System.out.print("Restaurant: ");
        scanner.nextLine();
        // fflush(stdin);
        restaurant =scanner.nextLine();
        System.out.print("Food: ");
        food = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Time: ");
        time = scanner.nextLine();
        Schedule s = new Schedule(restaurant,food,address,time);
        mondayS.add(s);
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        writeDatM();
        
        if(ans == 'y' )
        {
            menu();
        }
        else if(ans == 'n')
        {
            mainMenu();
        }
        else
        {
            System.exit(0);
        }
       
       
    }
    public void tuesdaySchedule(){
        String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
        char ans;
        
        System.out.println("\nTuesday Schedule");
        System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        System.out.print("Restaurant: ");
        scanner.nextLine();
        restaurant = scanner.nextLine();
        System.out.print("Food: ");
        food = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Time: ");
        time = scanner.nextLine();
        Schedule s = new Schedule(restaurant,food,address,time);
        tuesdayS.add(s);
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        writeDatT();
        
        if(ans == 'y' )
        {
            menu();
        }
        else if(ans == 'n')
        {
            mainMenu();
        }
        else
        {
            System.exit(0);
        }
        
       
    }
    public void wednesdaySchedule(){
        String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
        char ans;
        
        System.out.println("\nWednesday Schedule");
        System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        System.out.print("Restaurant: ");
        scanner.nextLine();
        restaurant = scanner.nextLine();
        System.out.print("Food: ");
        food = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Time: ");
        time = scanner.nextLine();
        Schedule s = new Schedule(restaurant,food,address,time);
        wednesdayS.add(s);
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        writeDatW();
         if(ans == 'y' )
        {
            menu();
        }
        else if(ans == 'n')
        {
            mainMenu();
        }
        else
        {
            System.exit(0);
        }

        
    }
    public void thursdaySchedule(){
        String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
        char ans;
        
        System.out.println("\nThursday Schedule");
        System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        System.out.print("Restaurant: ");
        scanner.nextLine();
        restaurant = scanner.nextLine();
        System.out.print("Food: ");
        food = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Time: ");
        time = scanner.nextLine();
        Schedule s = new Schedule(restaurant,food,address,time);
        thursdayS.add(s);
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        writeDatTh();
         if(ans == 'y' )
        {
            menu();
        }
        else if(ans == 'n')
        {
            mainMenu();
        }
        else
        {
            System.exit(0);
        }
       
    }
    
    public void fridaySchedule(){
        String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
        char ans;
        
        System.out.println("\nFriday Schedule");
        System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        System.out.print("Restaurant: ");
        scanner.nextLine();
        restaurant = scanner.nextLine();
        System.out.print("Food: ");
        food = scanner.nextLine();
        System.out.print("Address: ");
        address = scanner.nextLine();
        System.out.print("Time: ");
        time = scanner.nextLine();
        Schedule s = new Schedule(restaurant,food,address,time);
        fridayS.add(s);
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        writeDatF();
         if(ans == 'y' )
        {
            menu();
        }
        else if(ans == 'n')
        {
            mainMenu();
        }
        else
        {
            System.exit(0);
        }
        
    }
    public void displayMenu(){
        System.out.println("\nView Schedule Orders: ");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.print("Please choose your choice:");
        int choice = scanner.nextInt();
        
        if(choice == 1)
        {
            displayMonday();
        }
        else if(choice == 2)
        {
            displayTuesday();
        }    
        else if(choice == 3)
        {
            displayWednesday();
        }
        else if(choice == 4)
        {
           displayThursday();
        }
        else if(choice == 5)
        {
            displayFriday();
        }
        else 
        {
            System.exit(1);
        }
    }
    
    public void displayMonday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("monday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
        readDatM();
        if(!mondayS.isEmpty())
        {
            
            System.out.println("\nMonday Schedule");
            for (int i=0; i< mondayS.size(); i++)
            {
                System.out.printf("%s\n", mondayS.get(i));
            }
        }
        else
        {
            System.out.println("Monday schedule havent set\n");
        }
            }
        }catch(Exception ex)
        {
            
        }
    }
    public void displayTuesday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("tuesday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
        readDatT();
        if(!tuesdayS.isEmpty())
        {
            System.out.println("\nTuesday Schedule");
            for (int i=0; i< tuesdayS.size(); i++)
            {
                System.out.printf("%s\n", tuesdayS.get(i));
            }
        }
        else
        {
            System.out.println("Tuesday schedule havent set\n");
        }
            }
        }catch(Exception ex)
        {
            
        }
    }
    public void displayWednesday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("wednesday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
        readDatW();
        if(!wednesdayS.isEmpty())
        {
            System.out.println("\nWednesday Schedule");
            for (int i=0; i< wednesdayS.size(); i++)
            {
                System.out.printf("%s\n", wednesdayS.get(i));
            }
        }
        else
        {
            System.out.println("Wednesday schedule havent set\n");
        }
            }
        }catch(Exception ex)
        {
            
        }
    }
    public void displayThursday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("thursday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
         readDatTh();
         if(!thursdayS.isEmpty())
        {
            System.out.println("\nThursday Schedule");
            for (int i=0; i< thursdayS.size(); i++)
            {
                System.out.printf("%s\n", thursdayS.get(i));
            }
        }
        else
        {
            System.out.println("Thursday schedule havent set\n");
        }
            }
        }catch(Exception ex)
        {
            
        }
    }
    public void displayFriday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("friday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
         readDatF();
         if(!fridayS.isEmpty())
        {
            System.out.println("\nFriday Schedule");
            for (int i=0; i< fridayS.size(); i++)
            {
                System.out.printf("%s\n", fridayS.get(i));
            }
        }
        else
        {
            System.out.println("Friday schedule havent set\n");
        }
            }
        }catch(Exception ex)
        {
            
        }
    }
    /*
    private void displaySchedule(){
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
        
        try {
      ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("wednesday.dat"));
      wednesdayS = (ArrayList) (oiStream.readObject());
      oiStream.close();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
        
         try {
      ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("thursday.dat"));
      thursdayS = (ArrayList) (oiStream.readObject());
      oiStream.close();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
         
          try {
      ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("friday.dat"));
      fridayS = (ArrayList) (oiStream.readObject());
      oiStream.close();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
        if(!mondayS.isEmpty())
        {
            
            System.out.println("\nMonday Schedule");
            for (int i=0; i< mondayS.size(); i++)
            {
                System.out.printf("%s\n", mondayS.get(i));
            }
        }
        else
        {
            System.out.println("Monday schedule havent set\n");
        }
        
        if(!tuesdayS.isEmpty())
        {
            System.out.println("\nTuesday Schedule");
            for (int i=0; i< tuesdayS.size(); i++)
            {
                System.out.printf("%s\n", tuesdayS.get(i));
            }
        }
        else
        {
            System.out.println("Tuesday schedule havent set\n");
        }
        
        if(!wednesdayS.isEmpty())
        {
            System.out.println("\nWednesday Schedule");
            for (int i=0; i< wednesdayS.size(); i++)
            {
                System.out.printf("%s\n", wednesdayS.get(i));
            }
        }
        else
        {
            System.out.println("Wednesday schedule havent set\n");
        }
        
        if(!thursdayS.isEmpty())
        {
            System.out.println("\nThursday Schedule");
            for (int i=0; i< thursdayS.size(); i++)
            {
                System.out.printf("%s\n", thursdayS.get(i));
            }
        }
        else
        {
            System.out.println("Thursday schedule havent set\n");
        }
        
        if(!fridayS.isEmpty())
        {
            System.out.println("\nFriday Schedule");
            for (int i=0; i< fridayS.size(); i++)
            {
                System.out.printf("%s\n", fridayS.get(i));
            }
        }
        else
        {
            System.out.println("Friday schedule havent set\n");
        }
    }*/
    public void updateSchedule(){
         System.out.println("\nUpdate Schedule Orders: ");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.print("Please choose your choice:");
        int choice = scanner.nextInt();
        
        if(choice == 1)
        {
            updateMonday();
        }
        else if(choice == 2)
        {
            updateTuesday();
        }    
        else if(choice == 3)
        {
           updateWednesday();
        }
        else if(choice == 4)
        {
          updateThursday();
        }
        else if(choice == 5)
        {
            updateFriday();
        }
        else 
        {
            System.exit(1);
        }
    }
    public void cancelSchedule(){
         System.out.println("\nCancel Schedule Orders: ");
        System.out.println("1. Monday");
        System.out.println("2. Tuesday");
        System.out.println("3. Wednesday");
        System.out.println("4. Thursday");
        System.out.println("5. Friday");
        System.out.print("Please choose your choice:");
        int choice = scanner.nextInt();
        
        if(choice == 1)
        {
            cancelMonday();
        }
        else if(choice == 2)
        {
            cancelTuesday();
        }    
        else if(choice == 3)
        {
           cancelWednesday();
        }
        else if(choice == 4)
        {
          cancelThursday();
        }
        else if(choice == 5)
        {
            cancelFriday();
        }
        else 
        {
            System.exit(1);
        }
    }
    public void updateMonday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("monday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
        String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
         char ans;
        readDatM();
        if(!mondayS.isEmpty())
        {
            
            System.out.println("\nUpdate Monday Schedule");
            for (int i=0; i< mondayS.size(); i++)
            {
                System.out.printf("%s\n", mondayS.get(i));
            }
        }
        else
        {
            System.out.println("Monday schedule havent set\n");
        }
        System.out.print("Please Enter The Information That You Want to Update");
        System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        for (int i=0; i< mondayS.size(); i++)
        {
                
            
        System.out.print("Restaurant: ");
        scanner.nextLine();
        // fflush(stdin);
        restaurant =scanner.nextLine();
        mondayS.get(i).setRestaurant(restaurant);
        System.out.print("Food: ");
        food = scanner.nextLine();
        mondayS.get(i).setFood(food);
        System.out.print("Address: ");
        address = scanner.nextLine();
        mondayS.get(i).setAddress(address);
        System.out.print("Time: ");
        time = scanner.nextLine();
        mondayS.get(i).setTime(time);
        }
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        writeDatM();
        
        if(ans == 'y' )
        {
            updateSchedule();
        }
        else if(ans == 'n')
        {
            mainMenu();
        }
        else
        {
            System.exit(0);
        }
            }
        }catch(Exception ex)
        {
            
        }
    }
    public void cancelMonday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("monday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
                char ans;
        readDatM();
        if(!mondayS.isEmpty())
        {
            
            System.out.println("\nThis is the existing Monday Schedule");
            for (int i=0; i< mondayS.size(); i++)
            {
                System.out.printf("%s\n", mondayS.get(i));
            }
        }
        else
        {
            System.out.println("Monday schedule havent set\n");
        }
       
        System.out.print("Do you want continue cancel schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        
        if(ans == 'y' )
        {
           
            PrintWriter pw = new PrintWriter("monday.dat");
            pw.close();
            System.out.println("Cancel Successful");
        }
        else if(ans == 'n')
        {
            cancelSchedule();
        }
        else
        {
            System.exit(0);
        }
            }
         
        }catch(Exception ex)
        {
            
        }
    }
    public void cancelTuesday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("tuesday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
                char ans;
        readDatT();
        if(!tuesdayS.isEmpty())
        {
            
            System.out.println("\nThis is the existing Tuesday Schedule");
            for (int i=0; i< tuesdayS.size(); i++)
            {
                System.out.printf("%s\n", tuesdayS.get(i));
            }
        }
        else
        {
            System.out.println("Tuesday schedule havent set\n");
        }
       
        System.out.print("Do you want continue cancel schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        
        if(ans == 'y' )
        {
           
            PrintWriter pw = new PrintWriter("tuesday.dat");
            pw.close();
            System.out.println("Cancel Successful");
        }
        else if(ans == 'n')
        {
            cancelSchedule();
        }
        else
        {
            System.exit(0);
        }
            }
         
        }catch(Exception ex)
        {
            
        }
    }
    public void cancelWednesday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("wednesday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
                char ans;
        readDatW();
        if(!wednesdayS.isEmpty())
        {
            
            System.out.println("\nThis is the existing Wednesday Schedule");
            for (int i=0; i< wednesdayS.size(); i++)
            {
                System.out.printf("%s\n", wednesdayS.get(i));
            }
        }
        else
        {
            System.out.println("Wednesday schedule havent set\n");
        }
       
        System.out.print("Do you want continue cancel schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        
        if(ans == 'y' )
        {
           
            PrintWriter pw = new PrintWriter("wednesday.dat");
            pw.close();
            System.out.println("Cancel Successful");
        }
        else if(ans == 'n')
        {
            cancelSchedule();
        }
        else
        {
            System.exit(0);
        }
            }
         
        }catch(Exception ex)
        {
            
        }
    }
    public void cancelThursday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("thursday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
                char ans;
        readDatTh();
        if(!thursdayS.isEmpty())
        {
            
            System.out.println("\nThis is the existing Thursday Schedule");
            for (int i=0; i< thursdayS.size(); i++)
            {
                System.out.printf("%s\n", thursdayS.get(i));
            }
        }
        else
        {
            System.out.println("Thursday schedule havent set\n");
        }
       
        System.out.print("Do you want continue cancel schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        
        if(ans == 'y' )
        {
           
            PrintWriter pw = new PrintWriter("thursday.dat");
            pw.close();
            System.out.println("Cancel Successful");
        }
        else if(ans == 'n')
        {
            cancelSchedule();
        }
        else
        {
            System.exit(0);
        }
            }
         
        }catch(Exception ex)
        {
            
        }
    }
    public void cancelFriday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("friday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
                char ans;
        readDatF();
        if(!fridayS.isEmpty())
        {
            
            System.out.println("\nThis is the existing Friday Schedule");
            for (int i=0; i< fridayS.size(); i++)
            {
                System.out.printf("%s\n", fridayS.get(i));
            }
        }
        else
        {
            System.out.println("Friday schedule havent set\n");
        }
       
        System.out.print("Do you want continue cancel schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        
        if(ans == 'y' )
        {
           
            PrintWriter pw = new PrintWriter("friday.dat");
            pw.close();
            System.out.println("Cancel Successful");
        }
        else if(ans == 'n')
        {
            cancelSchedule();
        }
        else
        {
            System.exit(0);
        }
            }
         
        }catch(Exception ex)
        {
            
        }
    }
    public void updateTuesday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("tuesday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
         String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
         char ans;
        readDatT();
        if(!tuesdayS.isEmpty())
        {
            System.out.println("\nUpdate Tuesday Schedule");
            for (int i=0; i< tuesdayS.size(); i++)
            {
                System.out.printf("%s\n", tuesdayS.get(i));
            }
        }
        else
        {
            System.out.println("Tuesday schedule havent set\n");
        }
        System.out.print("Please Enter The Information That You Want to Update");
        System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        for (int i=0; i< tuesdayS.size(); i++)
        {
                
            
        System.out.print("Restaurant: ");
        scanner.nextLine();
        // fflush(stdin);
        restaurant =scanner.nextLine();
        tuesdayS.get(i).setRestaurant(restaurant);
        System.out.print("Food: ");
        food = scanner.nextLine();
        tuesdayS.get(i).setFood(food);
        System.out.print("Address: ");
        address = scanner.nextLine();
        tuesdayS.get(i).setAddress(address);
        System.out.print("Time: ");
        time = scanner.nextLine();
        tuesdayS.get(i).setTime(time);
        }
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        writeDatT();
        
        if(ans == 'y' )
        {
            updateSchedule();
        }
        else if(ans == 'n')
        {
            mainMenu();
        }
        else
        {
            System.exit(0);
        }
            }
        }catch(Exception ex)
        {
            
        }
    }
    public void updateWednesday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("wednesday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
         String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
         char ans;
        readDatW();
        if(!wednesdayS.isEmpty())
        {
            System.out.println("\nUpdate Wednesday Schedule");
            for (int i=0; i< wednesdayS.size(); i++)
            {
                System.out.printf("%s\n", wednesdayS.get(i));
            }
        }
        else
        {
            System.out.println("Wednesday schedule havent set\n");
        }
        System.out.print("Please Enter The Information That You Want to Update");
        System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        for (int i=0; i< wednesdayS.size(); i++)
        {
                
            
        System.out.print("Restaurant: ");
        scanner.nextLine();
        // fflush(stdin);
        restaurant =scanner.nextLine();
        wednesdayS.get(i).setRestaurant(restaurant);
        System.out.print("Food: ");
        food = scanner.nextLine();
        wednesdayS.get(i).setFood(food);
        System.out.print("Address: ");
        address = scanner.nextLine();
        wednesdayS.get(i).setAddress(address);
        System.out.print("Time: ");
        time = scanner.nextLine();
        wednesdayS.get(i).setTime(time);
        }
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        writeDatW();
        
        if(ans == 'y' )
        {
            updateSchedule();
        }
        else if(ans == 'n')
        {
            mainMenu();
        }
        else
        {
            System.exit(0);
        }
            }
        }catch(Exception ex)
        {
            
        }
    }
    public void updateThursday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("thursday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
         String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
         char ans;
        readDatTh();
         if(!thursdayS.isEmpty())
        {
            System.out.println("\nUpdate Thursday Schedule");
            for (int i=0; i< thursdayS.size(); i++)
            {
                System.out.printf("%s\n", thursdayS.get(i));
            }
        }
        else
        {
            System.out.println("Thursday schedule havent set\n");
        }
         System.out.print("Please Enter The Information That You Want to Update");
        System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        for (int i=0; i< thursdayS.size(); i++)
        {
                
            
        System.out.print("Restaurant: ");
        scanner.nextLine();
        // fflush(stdin);
        restaurant =scanner.nextLine();
        thursdayS.get(i).setRestaurant(restaurant);
        System.out.print("Food: ");
        food = scanner.nextLine();
        thursdayS.get(i).setFood(food);
        System.out.print("Address: ");
        address = scanner.nextLine();
        thursdayS.get(i).setAddress(address);
        System.out.print("Time: ");
        time = scanner.nextLine();
        thursdayS.get(i).setTime(time);
        }
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        writeDatTh();
        
        if(ans == 'y' )
        {
            updateSchedule();
        }
        else if(ans == 'n')
        {
            mainMenu();
        }
        else
        {
            System.exit(0);
        }
            }
        }catch(Exception ex)
        {
            
        }
    }
    public void updateFriday(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("friday.dat"));     
            if (br.readLine() == null) {
            System.out.println("No errors, and file empty");
            }
            else{
         String restaurant= null;
        String food= null;
        String address= null;
        String time= null;
         char ans;
         readDatF();
         if(!fridayS.isEmpty())
        {
            System.out.println("\nUpdate Friday Schedule");
            for (int i=0; i< fridayS.size(); i++)
            {
                System.out.printf("%s\n", fridayS.get(i));
            }
        }
        else
        {
            System.out.println("Friday schedule havent set\n");
        }
         System.out.print("Please Enter The Information That You Want to Update");
        System.out.print("This is the restaurant that you can choose: \n");
        for(int i=0;i< restaurantN.length;i++)
        {
            System.out.printf((i+1)+"." + " %s\n",restaurantN[i]);
            
        }
        System.out.print("\n");
        for (int i=0; i< fridayS.size(); i++)
        {
                
            
        System.out.print("Restaurant: ");
        scanner.nextLine();
        // fflush(stdin);
        restaurant =scanner.nextLine();
        fridayS.get(i).setRestaurant(restaurant);
        System.out.print("Food: ");
        food = scanner.nextLine();
        fridayS.get(i).setFood(food);
        System.out.print("Address: ");
        address = scanner.nextLine();
        fridayS.get(i).setAddress(address);
        System.out.print("Time: ");
        time = scanner.nextLine();
        fridayS.get(i).setTime(time);
        }
        System.out.print("Do you want continue set schedule order?(y/n) ");
        ans = scanner.next().charAt(0);
        
        writeDatF();
        
        if(ans == 'y' )
        {
            updateSchedule();
        }
        else if(ans == 'n')
        {
            mainMenu();
        }
        else
        {
            System.exit(0);
        }
            }
        }catch(Exception ex)
        {
            
        }
    }
    
    public void writeDatM(){
        try {
        ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("monday.dat"));
        ooStream.writeObject(mondayS);
      //ooStream.close();
       
        } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void writeDatT(){
        try {
        ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("tuesday.dat"));
        ooStream.writeObject(tuesdayS);
      //ooStream.close();
       
        } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void writeDatW(){
        try {
        ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("wednesday.dat"));
        ooStream.writeObject(wednesdayS);
      //ooStream.close();
       
        } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void writeDatTh(){
        try {
        ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("thursday.dat"));
        ooStream.writeObject(thursdayS);
      //ooStream.close();
       
        } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void writeDatF(){
        try {
        ObjectOutputStream ooStream = new ObjectOutputStream(new FileOutputStream("friday.dat"));
        ooStream.writeObject(fridayS);
      //ooStream.close();
       
        } catch (FileNotFoundException ex) {
        JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Cannot save to file", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void readDatM(){
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
    }
    public void readDatT(){
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
    }
    public void readDatW(){
        try {
      ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("wednesday.dat"));
      wednesdayS = (ArrayList) (oiStream.readObject());
      oiStream.close();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    }
    public void readDatTh(){
        try {
      ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("thursday.dat"));
      thursdayS = (ArrayList) (oiStream.readObject());
      oiStream.close();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    }
    public void readDatF(){
        try {
      ObjectInputStream oiStream = new ObjectInputStream(new FileInputStream("friday.dat"));
      fridayS = (ArrayList) (oiStream.readObject());
      oiStream.close();
    } catch (FileNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "File not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "Cannot read from file", "ERROR", JOptionPane.ERROR_MESSAGE);
    } catch (ClassNotFoundException ex) {
      JOptionPane.showMessageDialog(null, "Class not found", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    }
}
