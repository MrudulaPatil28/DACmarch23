import java.util.Scanner;
class Palindrome{
    static int sum=0,rem;
	
    static int isPalindrome(int num)
    {
        if(num == Palindrome.reverse(num))
        {
            return 1;
        }
    return 0;
    }
    static int reverse(int num){
       if(num!=0){
            rem=num%10;
            sum=sum*10+rem;
            reverse(num/10);
        }
        else
            return sum;
        return sum;
    }
    public static void main(String[] args){
        int result;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number- ");  
        int originalNum= sc.nextInt();  
        result = Palindrome.isPalindrome(originalNum);
		
        if(result == 1){
            System.out.println("number is a palindrome");
        }else{
            System.out.println("number is not a palindrome");
        }
    }
}