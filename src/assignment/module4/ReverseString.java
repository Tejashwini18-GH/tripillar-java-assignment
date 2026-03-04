package assignment.module4;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println("Reversed String: " + sb);
        sc.close();
    }
}
