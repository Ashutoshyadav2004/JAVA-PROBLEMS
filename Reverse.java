import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  //500        50  5
        String rev="";
        while (n != 0) {
            int d = n % 10;  //500%10==0 d==0   d==0     d==5
            rev = rev + d;   //  rev=0;     00     005
            n = n / 10;       //50      5
        }
        System.out.println(rev);
    }
}

