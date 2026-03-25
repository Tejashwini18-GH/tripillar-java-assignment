package assignment.module8;

// LeetCode 191 - Number of 1 Bits
public class NumberOfBits {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n >>>= 1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(hammingWeight(n));
    }
}
