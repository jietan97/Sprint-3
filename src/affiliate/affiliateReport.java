package affiliate;

import adt.LList;
import adt.ListInterface;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class affiliateReport {
    static AffiliateClass as = new AffiliateClass();
    static Scanner sc = new Scanner(System.in);
    static ListInterface<AffiliateClass> affiliates = new LList<>();
    static ListInterface<foodMenuClass> foodM = new LList<>();
    
    public static void main(String[] args) {
        AffiliatesReport();
    }
    
    public static void AffiliatesReport(){
        System.out.println("\n-- Fastest Deliveryman --\nAffiliates Report\n====================================");
        System.out.print("Enter Restaurant ID\t: ");
        as.affID = sc.nextLine();
        ShowAffiliatesReport();
    }
    
    public static void ShowAffiliatesReport(){
        int qttFood = 0;
        double ttPrice = 0.0;
        foodM = affiliate.foodMenu.retrieveFoodMenu();
        affiliates = affiliate.AffiliatesRegistration.retrieveAffiliate();
        System.out.println("\n-- Fastest Deliveryman --\nAffiliates Report Details\n====================================");
        for (int j = 1; j < affiliates.getNumberOfEntries() + 1; j++) {
            if (as.affID.equals(affiliates.getEntry(j).getAffID())){
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                
                System.out.println("Restaurant\t: "+affiliates.getEntry(j).getRestaurantName());
                System.out.println("Owner\t\t: "+affiliates.getEntry(j).name);
                System.out.println("Report Date\t: "+dtf.format(now));
                System.out.println("\nFoods in system : ");
                System.out.printf("ID   %-26s - %-10s\n","Food Name","Price");
                System.out.println("==== ========================== - ==========");
                
                for (int t = 1; t < foodM.getNumberOfEntries() + 1; t++) {
                    if (as.affID.equals(foodM.getEntry(t).getAffID())){
                        System.out.printf("%s %-26s - RM %7.2f\n",foodM.getEntry(t).foodID,foodM.getEntry(t).foodName,foodM.getEntry(t).foodPrice);
                        qttFood++;
                        ttPrice += foodM.getEntry(t).foodPrice;
                    }
                }
                
                System.out.println("                                  ==========");
                System.out.printf("%34sRM %7.2f","Total - ",ttPrice);
                System.out.println("\n                                  ==========");
                
                System.out.println("\nNumber of foods in list : " + qttFood);
            }
        }
    }
//    
//    public static class foodMenuStream implements Serializable {
//
//        public String affID = null;
//        public String foodName = null;
//        public String foodDesc = null;
//        public String foodPrice = null;
//        public String promotionPrice = null;
//    }
}
