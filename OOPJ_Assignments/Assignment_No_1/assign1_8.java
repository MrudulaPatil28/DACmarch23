
public class assign1_8 {
    public static void main(String [] args)
    {
       byte b1=1;
       byte b2=4;
       String s1 = String.valueOf(b1);
       String s2 = String.valueOf(b2);
       System.out.println(s1);
       System.out.println(s2);
       Byte B1 =new Byte(b1);
       Byte B2 =new Byte(b2);
       System.out.println(B1);
       System.out.println(B2);
       Byte B3 = Byte.valueOf(s1);
       Byte B4 = Byte.valueOf(s2);
       System.out.println(B3);
       System.out.println(B4);

    }

}