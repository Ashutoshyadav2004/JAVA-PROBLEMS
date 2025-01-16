import java.util.*;

public class SmallestDivisor {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       int SmallestDivisor=n;
       for(int i=2;i<=Math.sqrt(n); i++){
        if(n%i==0){
            SmallestDivisor=i;
        }
       }
       System.out.println(SmallestDivisor);
    }
}