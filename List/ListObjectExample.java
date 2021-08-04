package List;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name , Integer age) {
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age=age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class ListObjectExample {
    public static void main(String [] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Amin",24));
        people.add(new Person("Mihir",23));
        people.add(new Person("Vijay",3));

        System.out.println(people);

//        people.sort((person1,person2) -> {
//            return person1.getAge() - person2.getAge();
//        });
//        System.out.println(people);
//
//    people.forEach(user -> {
//        System.out.println("Name :"+user.getName() + "<===> Age :"+user.getAge());
//    });


    }
}
