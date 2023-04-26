
import java.util.Scanner;
public class coding3 {

    public static void main(String[] Strings)
     {
        double minutesInYear = 60 * 24 * 365;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of minutes: ");
        double min = sc.nextDouble();
        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24);
        System.out.println((int) min + " minutes is means " + years + " years and " + days + " days");
    }
}