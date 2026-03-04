package assignment.module4;

import java.util.Scanner;
class Student {

    static String college = "SCE";
    int rollNo;
    String name;
    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    static void changeCollege(String newCollege) {
        college = newCollege;
    }
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
public class StaticDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter new college name: ");
        String college=sc.nextLine();
        System.out.println("Enter the details of first student:");
        System.out.println("Enter roll no: ");
        int rollno1=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name: ");
        String name1=sc.nextLine();
        System.out.println("Enter the details of second student:");
        System.out.println("Enter roll no: ");
        int rollno2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name: ");
        String name2=sc.nextLine();
        Student.changeCollege(college);
        Student s1 = new Student(rollno1,name1);
        Student s2 = new Student(rollno2,name2);
        s1.display();
        s2.display();
    }
}
