//GCD -- 
import java.util.*;
public class Gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=0;
        for(int i=1;i<=a;i++){
            if(a%i==0&&b%i==0){
                gcd=i;
            }
            
        
        }
        System.out.println("The HCF of a,b is "+  gcd);

    }
    
}
