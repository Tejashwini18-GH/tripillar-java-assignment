package assignment.module4;

class FinalClass {
    void show() {
        System.out.println("This is a final class.");
    }
}
class Parent {
    final int x = 100;
    final void display() {
        System.out.println("This is a final method.");
    }
}
class Child extends Parent {
//    void display() {
//        System.out.println("Trying to override final method");
//    }
}
public class FinalExample {
    public static void main(String[] args) {
        final int y = 50;
        System.out.println("Final variable y: " + y);
        Child obj = new Child();
        obj.display();
        System.out.println("Final variable x: " + obj.x);
        FinalClass fc = new FinalClass();
        fc.show();
    }
}
