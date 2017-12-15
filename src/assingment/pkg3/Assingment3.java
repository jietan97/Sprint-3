/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment.pkg3;

import java.text.SimpleDateFormat;
import java.util.*;

public class Assingment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Assingment3 ass = new Assingment3();
        ass.input();
    }

    public void input() {

        Scanner orderID = new Scanner(System.in);
        String orderNo;

        System.out.print("Enter your order ID: ");
        orderNo = orderID.nextLine();

        if (orderNo.equals("NO100")) {

            String time1 = "4:41 pm";

            try {
                Calendar c = Calendar.getInstance();
                SimpleDateFormat sdfOrdered = new SimpleDateFormat("hh:mm aa");
                Date orderedDate = sdfOrdered.parse(time1);
                c.setTime(orderedDate);
                String aa;

                Calendar cal = new GregorianCalendar();
                Date sysDate = new Date();

                if (c.get(Calendar.AM_PM) == 1) {
                    aa = "pm";
                    System.out.println("Item: Pizza");
                    System.out.println("Your delivery time is " + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + " " + aa);
                    int remainingHour = c.get(Calendar.HOUR) - cal.get(Calendar.HOUR);
                    int remainingMinutes = c.get(Calendar.MINUTE) - cal.get(Calendar.MINUTE);

                        if(c.get(Calendar.HOUR) > cal.get(Calendar.HOUR) && remainingMinutes == 0) {
                           System.out.println("It will be reached whithin " + remainingHour + " hour."); 
                        }
 
                        if (remainingMinutes == 0 && remainingHour == 0) {
                        System.out.println("Your food maybe reached");
                    } else if (c.get(Calendar.MINUTE) > cal.get(Calendar.MINUTE) && remainingHour == 0) {
                        System.out.println("It will be reached whithin " + (remainingMinutes - 1) + " minutes.");
                    } 
                        else if (c.get(Calendar.MINUTE) < cal.get(Calendar.MINUTE)) {
                        remainingMinutes = (60 - cal.get(Calendar.MINUTE)) + (c.get(Calendar.MINUTE) - 1);
                        System.out.println("It will be reached whithin " + remainingMinutes + " minutes.");
                    }
                        else if(c.get(Calendar.HOUR) > cal.get(Calendar.HOUR) && c.get(Calendar.MINUTE) > cal.get(Calendar.MINUTE)) {
                        remainingMinutes = c.get(Calendar.MINUTE) - cal.get(Calendar.MINUTE) - 1;
                        System.out.println("It will be reached whithin " + remainingHour + " hour " + remainingMinutes + " minutes.");    
                        }
                        else if (remainingMinutes == 0 && c.get(Calendar.HOUR) == cal.get(Calendar.HOUR)) {

                        if ((c.get(Calendar.HOUR) <= cal.get(Calendar.HOUR)) || c.get(Calendar.MINUTE) < cal.get(Calendar.MINUTE)) {
                            System.out.println("Your food maybe reached");
                        } else {
                            remainingHour -= 1;
                            System.out.println(remainingHour + " hours D");
                        }
                    }
                    
                    
                } else if (c.get(Calendar.AM_PM) == 0) {
                    aa = "am";
                    System.out.println("Your have ordered in " + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + " " + aa);
                    int remainingHour = c.get(Calendar.HOUR) - cal.get(Calendar.HOUR);

                    if ((c.get(Calendar.HOUR) < cal.get(Calendar.HOUR)) || remainingHour == 0) {
                        System.out.println("Your item has reached");
                    } else {
                        System.out.println(remainingHour + " hours");
                    }

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } else {
            input();
        }
    }

}
