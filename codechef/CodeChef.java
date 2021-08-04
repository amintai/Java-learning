package codechef;

import java.util.*;

public class CodeChef {
    public static void main(String args []){

        Scanner scan = new Scanner(System.in);

       List<Integer> nums = new ArrayList<>();
       List<Integer> nums2 = new ArrayList<>();

       nums.add(3);
       nums.add(2);
       nums.add(5);

        nums2.add(4);
        nums2.add(2);
        nums2.add(1);

       nums.addAll(nums2);
        System.out.println(nums);
       Collections.sort(nums);

        System.out.println(nums);
    }
 }
