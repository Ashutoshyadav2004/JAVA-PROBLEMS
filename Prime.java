// Prime number -- a number that is only divisible by 1 or itself is a prime number
import java.util.*;
public class Prime{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                c++;
            }
            
        }
        if(c==2){
            System.out.println("It is a Prime number ");

        }
        else{
            System.out.println("It is not a Prime number");
        }
    }
}