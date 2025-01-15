import java.util.*;
public class Range{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     if(n>=1 && n<=100) {
        System.out.println("The number lies between 1 to 100 ");
     }  
     else{
        System.out.println("The number does not lies between 1 to 100");
     }
    }
}