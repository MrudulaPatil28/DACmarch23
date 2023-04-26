
public class assign1_20 {
    
    public static void main(String[] args){
        //long value into String
        long n = 5;
        String s1=String.valueOf(n);
        System.out.println(s1);
    
        //long value into long instance
        Long n1 = new Long(n);
        System.out.println(n1);
        //String instance into long instance
        String S2="911";
        String S3=new String(S2);
        System.out.println(S3);
        Long n2= new Long(S3);
        System.out.println(n2);
    
        }
}