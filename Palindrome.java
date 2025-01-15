//palindrome number means if u have a number and u reverse it then reverse number will be as same as the original number
import java.util.*;
public class Palindrome{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int original=n;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(original==rev){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println("Not a Palindrome number");
        }


    }
}
