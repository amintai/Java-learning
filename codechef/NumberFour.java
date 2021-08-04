package codechef;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumberFour {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 0;

        ArrayList<Integer> arr = new ArrayList<>();
         while (number>0) {
            int digit = number % 10;
            arr.add(digit);
            number = number / 10;
        }
         for(int e : arr){
             if(e==4){
                count++;
             }
         }
        System.out.println(count);
    }
}
