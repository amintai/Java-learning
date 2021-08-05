package OOPS;

abstract class Fly{
     void flying(){
         System.out.println("Hello From Abstract Class");
    }
    abstract void running();
}
class Plane extends Fly{
    void flying(){
        System.out.println("Dancing");
    }
    void running(){
        System.out.println("Body");
    }
}
class Heli extends Fly{
    void flying(){
        System.out.println("Helicopter");
    }
    void running(){
        System.out.println("Body");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Fly f1 = new Heli();

        f1.flying();
        f1.running();
    }
}
