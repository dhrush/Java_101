package Strings;

public class StringBasic {
    public static void main(String[] args) {
        /*
         * String s1 = "I Love"; s1 += " Java";
         * 
         * String s2 = "I"; s2 += " Love Java";
         * 
         * String s3 = s1.intern(); String s4 = s2.intern();
         * 
         * if (s3 == s4) { System.out.println("intern method works"); }
         */

        int i = 2, j = 3;
        int result = i * j;
        String output = i + " * " + j + " = " + result;
        System.out.println(output);
    }
}
