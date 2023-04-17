
public class assign1_16 {
    public static void main(String[] args){
    //int value into String
    int n = 5;
    String s1=String.valueOf(n);
    System.out.println(s1);

    //int value into Integer instance
    Integer n1 = new Integer(n);
    System.out.println(n1);
    //String instance into Integer instance
    String S2="911";
    String S3=new String(S2);
    System.out.println(S3);
    Integer n2= new Integer(S3);
    System.out.println(n2);

    }

}

