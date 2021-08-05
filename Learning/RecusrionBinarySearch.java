package Learning;

import java.util.Arrays;

public class RecusrionBinarySearch {

    public static int lookupBinary(int arr[],int num , int left , int right) {

//        Arrays.sort(arr);

            int midddle = (left + right)/ 2;
//        System.out.println(midddle+"middle");
            if (arr[midddle] == num) {
                return midddle;
            }

            if(left==right){
                if(arr[left] == num){
                    return left;
                } else {
                    return -1;
                }
            }

            if(num > arr[midddle]){
               return lookupBinary(arr,num,midddle+1,right);
            } else {
               return lookupBinary(arr,num,left,midddle-1);
            }
    }


    public static void main(String[] args) {
        int arr [] = {1,2,5,6,7};
        int found = lookupBinary(arr,6 ,0,arr.length-1);
//        System.out.println(found);
        if(found == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element is present on index :"+found);
        }
    }
}
