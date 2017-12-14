

/**
 *
 * @author Ong Chong Ren
 */
import java.util.*;

public class DSAassignment {

    static List<String> addressList = new ArrayList<>();
    static List<String> restaurantList = new ArrayList<>();
    static List<String> menuList = new ArrayList<>();
    static List<String> foodList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    static String address = "-1";
    static String restaurant;
    static String menu;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        DSAassignment dsa = new DSAassignment();
        while (!address.equals("0")) {
            mainMenu();
        }
    }

    public static void mainMenu() {
        System.out.print("====== Welcome to Fastest Deliveryman's ======\n ");
        //location
        System.out.println("Please enter your location : \n 1.KL\n 2.Puchong\n 3.Cheras\n");
        System.out.printf("Choice : ");
        address = sc.nextLine();

        switch (address) {
            case "1":
                restaurantSelection1();
                break;
            case "2":
                restaurantSelection2();
                break;
            case "3":
                restaurantSelection3();
                break;
            case "0":
                break;
            default:
                System.out.println("Please select num 1 to 3");
                break;

        }

    }

    public static void restaurantSelection1() {
        System.out.print("==============================================\n ");
        System.out.println("Please select your restaurant :\n "
                + "\n 1.Thai Boy Restaurant "
                + "\n 2.WanYee Restaurant "
                + "\n 3.Ho Chak\n");

        System.out.printf("Choice : ");
        restaurant = sc.nextLine();

        switch (restaurant) {
            case "1":
                System.out.print("==============================================\n ");
                System.out.print("Please select your menu :\n "
                        + "\n 1.Fried chicken (RM 5)"
                        + "\n 2.Nasi Goreng Thai (RM 5)"
                        + "\n 3.Thai Mee (RM 5)\n ");
                System.out.printf("Choice : ");
                menu = sc.nextLine();
                break;
            case "2":
                System.out.print("==============================================\n ");
                System.out.print("Please select your menu : "
                        + "\n 1.Fried chicken (RM 5)"
                        + "\n 2.Nasi Goreng Thai (RM 5)"
                        + "\n 3.Thai Mee (RM 5)\n ");
                System.out.printf("Choice : ");
                menu = sc.nextLine();
                break;
            case "3":
                System.out.print("==============================================\n ");
                System.out.print("Please select your menu : "
                        + "\n 1.Fried chicken (RM 5)"
                        + "\n 2.Nasi Goreng Thai (RM 5)"
                        + "\n 3.Thai Mee (RM 5)\n ");
                System.out.printf("Choice : ");
                menu = sc.nextLine();
                break;
            default:

                System.out.print("Please Try again.");
                break;
        }

        switch (menu) {
            case "1":
                System.out.print("==============================================\n ");
                System.out.println(" You have selected Fried Chicken (RM 5)");
                System.out.print("==============================================\n\n ");
                break;
            case "2":
                System.out.print("==============================================\n ");
                System.out.println(" You have selected Nasi Goreng Thai (RM 5)");
                System.out.print("==============================================\n\n ");
                break;
            case "3":
                System.out.print("==============================================\n ");
                System.out.println(" You have selected Thai Mee (RM 5)");
                System.out.print("==============================================\n\n");
                break;
            default:
                System.err.println("Wrong Selection");
                break;
        }

    }

    public static void restaurantSelection2() {
        System.out.print("==============================================\n ");
        System.out.println("Please select your restaurant : "
                + "\n 1.Thai Boy Restaurant "
                + "\n 2.WanYee Restaurant "
                + "\n 3.Ho Chak\n");
        System.out.printf("Choice : ");
        restaurant = sc.nextLine();

        switch (restaurant) {
            case "1":
                System.out.print("==============================================\n ");
                System.out.print("Please select your menu : "
                        + "\n 1.Fried chicken (RM 5)"
                        + "\n 2.Nasi Goreng Thai(RM 5)"
                        + "\n 3.Thai Mee (RM 5)\n ");
                System.out.printf("Choice : ");
                menu = sc.nextLine();
                break;
            case "2":
                System.out.print("==============================================\n ");
                System.out.print("Please select your menu : "
                        + "\n 1.Fried chicken (RM 5)"
                        + "\n 2.Nasi Goreng Thai (RM 5)"
                        + "\n 3.Thai Mee (RM 5)\n ");
                System.out.printf("Choice : ");
                menu = sc.nextLine();
                break;
            case "3":
                System.out.print("==============================================\n ");
                System.out.print("Please select your menu : "
                        + "\n 1.Fried chicken (RM 5)"
                        + "\n 2.Nasi Goreng Thai (RM 5)"
                        + "\n 3.Thai Mee (RM 5)\n ");
                System.out.printf("Choice : ");
                menu = sc.nextLine();
                break;
            default:
                System.out.print("Please Try again.");
                break;
        }
        switch (menu) {
            case "1":
                System.out.print("==============================================\n ");
                System.out.println(" You have selected Fried Chicken (RM 5)");
                System.out.print("==============================================\n\n ");
                break;
            case "2":
                System.out.print("==============================================\n ");
                System.out.println(" You have selected Nasi Goreng Thai (RM 5)");
                System.out.print("==============================================\n\n ");
                break;
            case "3":
                System.out.print("==============================================\n ");
                System.out.println(" You have selected Thai Mee (RM 5)");
                System.out.print("==============================================\n\n");
                break;
            default:
                System.err.println("Wrong Selection");
                break;
        }

    }

    public static void restaurantSelection3() {
        System.out.print("==============================================\n ");
        System.out.println("Please select your restaurant : "
                + "\n 1.Thai Boy Restaurant "
                + "\n 2.WanYee Restaurant "
                + "\n 3.Ho Chak \n");
        System.out.printf("Choice : ");
        restaurant = sc.nextLine();

        switch (restaurant) {
            case "1":
                System.out.print("==============================================\n ");
                System.out.print("Please select your menu : "
                        + "\n 1.Fried chicken (RM 5)"
                        + "\n 2.Nasi Goreng Thai (RM 5)"
                        + "\n 3.Thai Mee (RM 5)\n ");
                System.out.printf("Choice : ");
                menu = sc.nextLine();
                break;
            case "2":
                System.out.print("==============================================\n ");
                System.out.print("Please select your menu : \n"
                        + "\n 1.Fried chicken (RM 5)"
                        + "\n 2.Nasi Goreng Thai (RM 5)"
                        + "\n 3.Thai Mee (RM 5)\n ");
                System.out.printf("Choice : ");
                menu = sc.nextLine();
                break;
            case "3":
                System.out.print("==============================================\n ");
                System.out.print("Please select your menu : "
                        + "\n 1.Fried chicken (RM 5)"
                        + "\n 2.Nasi Goreng Thai (RM 5)"
                        + "\n 3.Thai Mee (RM 5)\n ");
                System.out.printf("Choice : ");
                menu = sc.nextLine();
                break;
            default:
                System.out.print("Please Try again.");
                break;
        }

        switch (menu) {
            case "1":
                System.out.print("==============================================\n ");
                System.out.println(" You have selected Fried Chicken (RM 5)");
                System.out.print("==============================================\n\n ");
                break;
            case "2":
                System.out.print("==============================================\n ");
                System.out.println(" You have selected Nasi Goreng Thai (RM 5)");
                System.out.print("==============================================\n\n ");
                break;
            case "3":
                System.out.print("==============================================\n ");
                System.out.println(" You have selected Thai Mee (RM 5)");
                System.out.print("==============================================\n\n");
                break;
            default:
                System.err.println("Wrong Selection");
                break;
        }
    }
}
