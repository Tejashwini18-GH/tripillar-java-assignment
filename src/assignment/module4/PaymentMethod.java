package assignment.module4;

import java.util.Scanner;

interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Credit Card.");
    }
}
class UPIPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using UPI.");
    }
}
public class PaymentMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter payment amount:");
        double amount = sc.nextDouble();
        System.out.println("Choose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        int choice = sc.nextInt();
        Payment payment;
        if (choice == 1) {
            payment = new CreditCardPayment();
        } else {
            payment = new UPIPayment();
        }
        payment.pay(amount);
        sc.close();
    }
}
