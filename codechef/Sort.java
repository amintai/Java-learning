package codechef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int temp=0;

        while(t-->0) {
            int arr[] = new int[t];
            for(int i=0;i<arr.length;i++) {
                arr[i] = scan.nextInt();
            }
            Arrays.sort(arr);
           for(int i=0;i<arr.length;i++) {
               System.out.println(arr[i]);
           }

        }
    }
}
