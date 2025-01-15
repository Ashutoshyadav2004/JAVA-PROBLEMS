// Armstrong number --- Armstrong number is a number that is equal to the sum of cubes of its digits
//ex--153== 1^3+5^3+3^3
import java.util.*;
public class Armstrong{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int original=n;
        int Arm=0;
        while(n!=0){
            int d=n%10;
            d=d*d*d;
            Arm=Arm+d; 
            n=n/10;
        }
        if(Arm==original){
            System.out.println("It is a Armstrong Number");
        }
        else {
            System.out.println("It is not a Armstrong number");
        }


    }
}