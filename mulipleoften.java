import java.util.*;
public class mulipleoften {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n%10==0){
            System.out.println("yes " + n  +" This is multiple of 10 ");
        }
        else{
            System.out.println("This is not multiple of 10");
        }
    }
    
}
