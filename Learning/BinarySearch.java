package Learning;

import java.util.Arrays;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BinarySearch {

    public static int lookup(int arr[] , int num) {
        Scanner scan = new Scanner(System.in);
//        int ans = -1;
        int left=0;
        int right=arr.length-1;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        while (left <= right){
            int middle = (left+right)/2;
//            System.out.println(arr[middle]);

            if(arr[middle] == num) {
                return middle;
            }
            if(num>arr[middle]){
                left = middle + 1;
            } else {
                right = middle-1;
            }

        }
        return -1;
    }
    @Test
    public void FirstTestCase(){
        int arr [] = {1,23,4,56,5,3};
        int newArray [] ;
        assertEquals(-1,lookup(new int[]{},3));
        assertEquals(-1,lookup(new int[]{1},3));
        assertEquals(0,lookup(new int[]{1},1));

        assertEquals(0,lookup(new int[]{1,3,5},1));
        assertEquals(1,lookup(new int[]{1,3,5},3));
        assertEquals(2,lookup(new int[]{1,3,5},5));
           assertEquals(-1,lookup(new int[]{1,3,5},0));
          assertEquals(-1,lookup(new int[]{1,3,5},2));
           assertEquals(-1,lookup(new int[]{1,3,5},4));
        assertEquals(-1,lookup(new int[]{1,3,5},6));

        assertEquals(0,lookup(new int[]{1,3,5,7},1));
         assertEquals(1,lookup(new int[]{1,3,5,7},3));
         assertEquals(2 , lookup(new int[]{1,3,5,7},5));
        assertEquals(3,lookup(new int[]{1,3,5,7},7));
       assertEquals(-1,lookup(new int[]{1,3,5,7},0));
       assertEquals(-1,lookup(new int[]{1,3,5,7},-1));
        assertEquals(-1,lookup(new int[]{1,3,5,7},4));
        assertEquals(-1,lookup(new int[]{1,3,5,7},6));
        assertEquals(-1 , lookup(new int[]{1,3,5,7},8));
        assertEquals(1, lookup(new int[]{1,2,45,6,7,4},2));
//        assert_equal(-1, lookup(8, [1, 3, 5, 7]))

    }

//    @Test
//    public void SecondTestCase(){
//        int arr [] = {1,23,4,56,5,3};
//        assertEquals(1,lookup(arr,3));
//    }


    public static void main(String[] args) {

        int arr [] = {1,23,4,56,5,3};
        int result = lookup(arr,5);
        System.out.println(result);


    }

}
