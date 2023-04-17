public class assign1_24 
{
    public static void main(String[] args){
        //float value into String
        float n = 9;
        String s1=String.valueOf(n);
        System.out.println(s1);
    
        //float value into double instance
        Float n1 = new Float(n);
        System.out.println(n1);
        //String instance into float instance
        String S2="11";
        String S3=new String(S2);
        System.out.println(S3);
        Float n2= new Float(S3);
        System.out.println(n2);
    
        }
}