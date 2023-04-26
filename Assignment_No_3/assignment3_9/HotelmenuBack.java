package oopj.assignment3_9;

import java.util.Arrays;
import java.util.Scanner;

enum Dish {
	one(50, "Dal Tadaka "), two(60, "Veg Pulav"), three(80, "Veg Thali"), four(120, "Veg Delux Thali"),
	five(40, "Allu Paratha"), six(20, "Samosa"), seven(10, "Chai");

	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public int getPrise() {
		return price;
	}

	Dish(int i, String string) {
		this.price = i;
		this.name = string;
	}
}

public class HotelmenuBack {
	static Dish[] sc = Dish.values();
	static Scanner sc1 = new Scanner(System.in);
	static String dish[] = new String[100];
	static int price[] = new int[100];
	static int dishnumber[]=new int[100];
	static int k = 0;

	public static void shouMenu() {
		for (int i = 0; i < Dish.values().length; i++) {
			System.out.printf("%-5d %-20s %-10s\n", (i + 1), Dish.values()[i].getName(), Dish.values()[i].getPrise());
		}
	}

	public static char choice() {
		System.out.println("Please enter the dish number you wish to order:-  ");
		int dishnumber = sc1.nextInt();
		HotelmenuBack.dish[k] = Dish.values()[dishnumber - 1].getName();
		System.out.println("Please enter the quantity you wish to order:-  ");
		int dishcount = sc1.nextInt();
		HotelmenuBack.dishnumber[k]=dishcount;
		HotelmenuBack. price[k] = (Dish.values()[dishnumber - 1].getPrise()) * dishcount;
		k++;
		System.out.println("Would you like to place another order? (Y/N):-");
		return sc1.next().charAt(0);
	}

	static void showBill() {
		int sum = 0;
		System.out.println("Your Total Bill is.....");
		System.out.println("Dish Name "+"               "+"Dish count"+"              "+"Total Prise");
		System.out.println("----------------------------------------------------------------------------------");
		for (int i = 0; i < HotelmenuBack.k; i++) {
			System.out.println(
					HotelmenuBack.dish[i] + "                                " + HotelmenuBack.dishnumber[i] + "                                  " + HotelmenuBack.price[i]);
			// System.out.printf("%-20s%-30d%d\n",dish[i] ,(prise[i] /
			// (Dish.values()[i].getPrise())),prise[i]); 
			sum = sum + price[i];
		}
		System.out.println("----------------------------------------------------------------------------------");
		System.out.printf("Total Prise %50d ", sum);
	}
}

