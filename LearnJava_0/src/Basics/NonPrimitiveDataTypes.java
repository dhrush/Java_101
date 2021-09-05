package Basics;

public class NonPrimitiveDataTypes {
    public static void main(String[] args) {
        String str = "Test";
        System.out.println("String is: " + str);

        String str1 = new String("Test2");
        System.out.println("Another String is: " + str1);

        int arr[] = new int[3];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        System.out.println(arr);
        System.out.println(arr[0]);
    }
}