package Basics;

public class TypeConversion {
    public static void main(String[] args) {
        /*
         * These are implicit conversion int a = 100;
         * System.out.println("Int representation: " + a);
         * 
         * long b = a; System.out.println("Long representation: " + b);
         * 
         * float c = b; System.out.println("Float representation: " + c);
         */

        double a = 50.50;
        System.out.println("Double representation: " + a);

        float b = (float) a;
        System.out.println("Float representation: " + b);

        long c = (long) b;
        System.out.println("Long representation: " + c);

        int d = (int) c;
        System.out.println("Int representation: " + d);

    }
}