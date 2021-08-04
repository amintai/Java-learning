package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class SarthakAnuradha {
    public static void main(String args []) {
        Scanner scan = new Scanner(System.in);
        int A = 1;
        int B = 3;

        int sarthak = 0;
        int anuradha = 0;

        String array [] = new String[4];
            for(int i=0;i<array.length;i++) {
                array[i]=scan.nextLine();
            }
            char arr[] = {'E','Q','U','I','N','O','X'};
            for(int i=0;i<array.length;i++) {
                if(array[i].startsWith("E") || array[i].startsWith("Q") || array[i].startsWith("U") || array[i].startsWith("I") || array[i].startsWith("N") || array[i].startsWith("O") || array[i].startsWith("X")  ){
                    sarthak++;
                } else {
                    anuradha++;
                }
            }
            if(sarthak*A > anuradha *B ){
                System.out.println("SARTHAK");
            } else {
                System.out.println("ANURADHA");
            }
        System.out.println("sarthak : "+sarthak);
        System.out.println("ANuradha:"+anuradha);

        System.out.println(Arrays.toString(array));


    }
}
