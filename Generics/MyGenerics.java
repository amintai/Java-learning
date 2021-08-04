package Generics;

import java.util.ArrayList;

public class MyGenerics<T> {

        ArrayList<T> nums = new ArrayList<>();

        public void addElement(T element){
            nums.add(element);
        }
        public void deleteElement(T element){
            nums.remove(element);
        }
        public void printElement(){
            System.out.println(nums);
        }
        public T get(int index) {
            return nums.get(index);
        }


}
