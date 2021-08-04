package List;

import java.util.ArrayList;
import java.util.List;

public class AddList {
    public static void main(String [] args) {
        List<Integer> firstFive = new ArrayList<>();
        firstFive.add(10);
        firstFive.add(20);
        firstFive.add(30);
        firstFive.add(40);
        firstFive.add(50);


        System.out.println(firstFive);
        List<Integer> lastFive = new ArrayList<>(firstFive);
        lastFive.add(100);
        lastFive.add(200);
        lastFive.add(300);
        lastFive.add(400);
        lastFive.add(500);

        System.out.println(lastFive);
    }
}
