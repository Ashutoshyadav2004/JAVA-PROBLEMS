// What is even 2,4,6
//odd 3,5,7
import java.util.*;
public class Even_Odd{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);  //input will be 4
        int n= sc.nextInt();
        if(n%2==0){
            System.out.println("It is Even number");
        }
        else{
            System.out.println("It is odd number");
        }

    }
}