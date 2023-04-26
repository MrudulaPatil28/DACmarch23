package oopj.assignment3_2;

import java.util.*;

class RestaurantX {

    int price;
    String dish;

    //RestaurantX class constructor  
    RestaurantX(String dish, int price) {
        this.price = price;
        this.dish = dish;
    }
}

class RestaurantTest {

    private static Scanner sc = new Scanner(System.in);

    public static void DisplayAllRecords(RestaurantX[] arr) {
        int No = 1;
        for (int i = 0; i < 10; i++) {

            System.out.println("Sr.No " + No + "   ===>   Price  " + arr[i].price + "  ===>   Dish name   " + arr[i].dish);
            No++;
            System.out.println();
        }
        System.out.println();
    }

    public static void AddNewDish(RestaurantX[] arr, String str, int no) {
        int i = 0;
        for (i = 0; i < 10; i++) {
            if (arr[i].dish == null) {
                arr[i].price = no;
                arr[i].dish = str;
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Dish name :=>   " + arr[i].dish + "added to Menu List");

                System.out.println("-------------------------------------------------------------------------");
                break;
            }
        }
        if (i == 10) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("MenuList is Already Full");

        }
        System.out.println();
    }

    public static void RemoveDish(RestaurantX[] arr, int no) {
        int i = 0;
        for (i = 0; i < 10; i++) {
            if (i == no) {
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Dish name :=> " + arr[i].dish + " is deleted from Menu List");
                System.out.println("-------------------------------------------------------------------------");
                arr[i].price = 0;
                arr[i].dish = null;

                break;
            }
        }
        if (i == 10) {
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Invalid Entry");

        }
        System.out.println();
    }

    public static void ModifyThePriceOfDish(RestaurantX[] arr, int No, int price) {
        for (int i = 0; i < arr.length; i++) {
            if (i == No) {
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Dish name :=> " + arr[i].dish + " Price is updated in Menu List");
                System.out.println("-------------------------------------------------------------------------");
                arr[i].price = price;
                break;
            }

            if (i == 10) {
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Invalid Serial Number");

            }
        }
    }

    public static int menuList() {
        System.out.println();
        System.out.println("--------------SELECT OPERATION------------------------");
        System.out.println("0.Exit");
        System.out.println("1.View the current menu with prices");
        System.out.println("2.Add a new dish to the menu");
        System.out.println("3.Remove a dish from the menu");
        System.out.println("4.Modify the price of a dish on the menu");
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }
}

public class Restaurant {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String arg[]) {

        RestaurantX[] arr = new RestaurantX[10];
        arr[0] = new RestaurantX("Palak Paneer", 430);
        arr[1] = new RestaurantX("Veg Malvani", 200);
        arr[2] = new RestaurantX("Kaju Karii", 270);
        arr[3] = new RestaurantX("Shev Bhaji", 90);
        arr[4] = new RestaurantX("Rajma Chawal", 350);
        arr[5] = new RestaurantX("Dal Bati", 200);
        arr[6] = new RestaurantX("Veg Maratha", 100);
        arr[7] = new RestaurantX("Kaju Masala", 270);
        arr[8] = new RestaurantX("chana Masala", 120);
        arr[9] = new RestaurantX("Dal Fry", 90);

        int choice;
        while ((choice = RestaurantTest.menuList()) != 0) {
            switch (choice) {
                case 1:
                    System.out.println();
                    RestaurantTest.DisplayAllRecords(arr);

                    break;

                case 2:

                    System.out.println("Enter the name of the dish you want to add");
                    sc.nextLine();
                    String str = sc.nextLine();

                    System.out.println("Enter the Price of ");
                    int price = sc.nextInt();
                    RestaurantTest.AddNewDish(arr, str, price);
                    break;

                case 3:

                    System.out.println();
                    System.out.println("Enter the Serial Number");
                    int no = sc.nextInt();
                    RestaurantTest.RemoveDish(arr, --no);

                    break;

                case 4:
                    System.out.println();
                    System.out.println("Enter the Serial Number");
                    no = sc.nextInt();
                    System.out.println("Enter the Updated Price");
                    price = sc.nextInt();
                    RestaurantTest.ModifyThePriceOfDish(arr, --no, price);
                    break;

                default:
                    System.out.println("Invalid Choice !!!");
            }
        }

    }

}