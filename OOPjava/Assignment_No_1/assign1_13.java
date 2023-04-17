
public class assign1_13{
    public static void main(String[] args){
        short x = 5;
        //short value into String
        String S =String.valueOf(x);
        System.out.println(S);
        //short value into Short instance
        Short S1 = new Short(x);
        System.out.println(S1);
        //String instance into Short instance
        String S2= "45" ;
        String S3= new String(S2);
        System.out.println(S3);
        Short S4 = new Short(S3);
        System.out.println(S4);
    }

}
    

