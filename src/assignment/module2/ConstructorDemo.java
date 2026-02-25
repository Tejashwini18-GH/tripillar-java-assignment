package assignment.module2;

class Student {
    String name;
    int age;
    Student() {
        name = "ABC";
        age = 0;
    }
    Student(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("XYZ", 20);
        s1.display();
        s2.display();
    }
}