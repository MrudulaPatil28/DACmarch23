// find the missing number in a given integer array of 1 to 100
public class Missing_number_1{
    static int arr[]={3,5,8,44,60,88}; //given array
    
    public static void main(String[] args) {
           displayMissing();       
    }
    
    static public void displayMissing(){
           
           System.out.print("given array(already sorted): ");
           for (int j = 0; j < arr.length; j++)
                  System.out.print(arr[j] +" "); // display it
           
           System.out.print("\nNumbers missing between 1 to 100 in array :  ");
           
           int j=0;
           for(int i=1;i<=100;i++){
                  if(j<arr.length && i==arr[j])
                        j++;
                  else
                        System.out.print(i+" ");
                  
           }
           
    }
    
}