package assignment.module4;
import java.util.Scanner;

abstract class Shape {
    abstract double area();
}
class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    double area() {
        return length * width;
    }
}
public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        double radius=sc.nextDouble();
        System.out.println("Enter the length of rectangle: ");
        double length=sc.nextDouble();
        System.out.println("Enter the width of rectangle: ");
        double width=sc.nextDouble();
        Shape c = new Circle(radius);
        Shape r = new Rectangle(length,width);
        System.out.println("Area of Circle: " + c.area());
        System.out.println("Area of Rectangle: " + r.area());
    }
}