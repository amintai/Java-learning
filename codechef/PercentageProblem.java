package codechef;

import java.util.Scanner;

public class PercentageProblem {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N");
        int n = scan.nextInt();
        int ans =0 ;
        while(n-- > 0){
            System.out.println("Enter Price");
            int q = scan.nextInt();
            System.out.println("Enter Quantity");
            int p = scan.nextInt();

//            int t_p = q * p;
            if(q > 1000) {
                ans = q*p;
                ans -= 0.10 * ans;
            } else {
                ans = q*p;
            }
            System.out.println(ans);
        }
    }
}
