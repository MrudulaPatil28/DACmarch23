package oopj.assignment3_5;

import java.util.*;
import java.util.Arrays;

class WareHouseX {

    public String str[][];

    public WareHouseX() {
        this.str = new String[10][10];

    }

}

class WareHouseTest {

    private static Scanner sc = new Scanner(System.in);

    public static void displayShelves(String str[][]) {
        int iNo = 1;
        System.out.println();
        for (int i = 0; i < str.length; i++) {

            System.out.println("Shelf No : " + (iNo++) + " => " + Arrays.deepToString(str[i]));
        }

        System.out.println();

    }

    public static void insertItem(String str[][], int No, String btr) {
        int iTemp = No;

        for (int i = (--No); i <= No; i++) {
            for (int j = 0; j < 10; j++) {
                if (str[i][j] == null) {
                    str[i][j] = btr;
                    System.out.println(btr + " is added to Shelf Number : " + iTemp);
                    break;
                }

            }
        }
        System.out.println("----------------------------------------------------------");
    }

    public static void deleteItem(String str[][], int No, String btr) {
        int iTemp = No;
        for (int i = (--No); i <= No; i++) {
            for (int j = 0; j < 10; j++) {
                if (str[i][j].equals(btr))   
                {
                    str[i][j] = null;
                    System.out.println(btr + " is deleted From Shelf Number : " + iTemp);
                    break;
                }
            }
        }
        System.out.println("----------------------------------------------------------");

    }

    public static int menuList() {
        System.out.println();
        System.out.println("--------------SELECT OPERATION------------------------");
        System.out.println("0.Exit");
        System.out.println("1.Display contents of all Shelves");
        System.out.println("2.Add item to shelf");
        System.out.println("3.Remove item from shelf");
        System.out.println("------------------------------------------------------");
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }

}

class WareHouse {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        WareHouseX obj = new WareHouseX();

        int choice;

        while ((choice = WareHouseTest.menuList()) != 0) {
            switch (choice) {
                case 1:
                    System.out.println();
                    WareHouseTest.displayShelves(obj.str);
                    break;

                case 2:
                    System.out.println();
                    System.out.println("Enter Shelf Number in which you want to add an Item");
                    int no = sc.nextInt();
                    System.out.println("Enter Name of Item");
                    sc.nextLine();
                    String str = sc.nextLine();
                    WareHouseTest.insertItem(obj.str, no, str);
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Enter Shelf Number from which you want to delete an Item");
                    no = sc.nextInt();
                    System.out.println("Enter Name of Item");
                    sc.nextLine();
                    str = sc.nextLine();
                    WareHouseTest.deleteItem(obj.str, no, str);

                    break;

                default:
                    System.out.println("Invalid Choice !!!");
            }
        }

    }
}

