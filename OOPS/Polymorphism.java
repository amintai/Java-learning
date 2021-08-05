package OOPS;
interface Flyable {
    public void fly();
    public void run();
}
 class Bird implements Flyable{
    public void fly(){
        System.out.println("From Bird");
    }
    public void run(){}

}
class Airoplane implements Flyable {
    public void fly() {
        System.out.println("From Airoplane");
    }
    public void run(){}
}
public class Polymorphism {
    public static void main(String[] args) {
        Flyable f1 = new Airoplane();
        f1.fly();
    }
}
