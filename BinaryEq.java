import java.util.*;

public class BinaryEq {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();  //16
        String binary="";
        while(n!=0){
          int d=n%2;  //16%2==0 d=0;
          binary=binary+d;
          n=n/2;
            
        }
        System.out.println(binary);

    }
    
}
