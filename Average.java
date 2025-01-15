// Average of a number-- 2,4,8 == 2*4*8/3=21
import java.util.*;
public class Average{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        System.out.println("The average of these numbrs are "+avg);

    }
}
