package assignment.module4;

//String vs StringBuilder vs StringBuffer

public class Difference {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat(" World");
        System.out.println("String after concat: " + s);
        s = s.concat(" World");
        System.out.println("String after reassignment: " + s);
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder after append: " + sb);
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer after append: " + sbf);
    }
}
