package Operators;

public class BitwiseOp {
    public static void main(String[] args) {
        int a = 5; // 5 = 0101
        int b = 7; // 7 = 0111
        System.out.println("a&b: " + (a & b));

        System.out.println("a|b: " + (a | b));

        System.out.println(a + ">>2: " + (a >> 2));

        System.out.println(a + "<<2: " + (a << 2));
    }
}
