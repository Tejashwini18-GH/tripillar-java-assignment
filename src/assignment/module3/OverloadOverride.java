package assignment.module3;

class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }
    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
class AdvancedCalculator extends Calculator {
    @Override
    int multiply(int a, int b) {
        return super.multiply(a, b) + 10;
    }
}
public class OverloadOverride {
    public static void main(String[] args) {
        AdvancedCalculator obj = new AdvancedCalculator();
        System.out.println(obj.multiply(2, 3));       // Overridden
        System.out.println(obj.multiply(2, 3, 4));    // Overloaded
    }
}