import java.util.Calendar;
class prac {
 public static void main(String[] args) {
 Calendar c = Calendar.getInstance();
 
 int day = c.get( Calendar.DATE );
 int month = c.get( Calendar.MONTH );
 int year = c.get( Calendar.YEAR );
 System.out.println( day +" / " + month+" / "+year);
 }
}