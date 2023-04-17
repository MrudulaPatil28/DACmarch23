class Test2{
    public static void main(String [] args){
//1
        boolean b1= true;
        String str= Boolean.toString( b1 );           //boxing
        System.out.println("b1: " +str);
//2
        boolean b2= false;
        boolean result= Boolean.valueOf(b2);     
        System.out.println("b2: " +result);
//3
        String str1= "TRUE";
        boolean result= Boolean.valueOf(str1);
        System.out.println("str1: " +result);  
//4
        //String str2= "FALSE";
         //Boolean result= Boolean.parseBoolean(str2);
        //System.out.println("str1: " +result); 

    }
}