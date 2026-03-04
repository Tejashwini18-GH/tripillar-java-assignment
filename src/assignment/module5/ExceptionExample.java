package assignment.module5;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample{
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("sample.txt");
            System.out.println("File opened successfully.");
        }
        catch (IOException e) {
            System.out.println("Checked Exception caught: " + e);
        }
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: " + e);
        }
        System.out.println("Program continues after exception handling.");
    }
}
