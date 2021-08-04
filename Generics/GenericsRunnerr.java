package Generics;

import java.util.Arrays;

public class GenericsRunnerr {
    public static void main(String [] args){
        MyGenerics<String> m1 = new MyGenerics();
        m1.addElement("AMIN");
        m1.addElement("MIHIR");
        m1.addElement("VIJAY");


        String value = m1.get(1);



        System.out.println(value);
//        m1.addElement(1);

        m1.printElement();
        m1.deleteElement("AMIN");
        m1.printElement();

        MyGenerics<Integer> m2 = new MyGenerics<>();
        m2.addElement(10);
        m2.addElement(20);
        m2.addElement(30);
        m2.printElement();
        int value2 = m2.get(2);

        System.out.println(value2);
//        System.out.println(m1);
    }
}
