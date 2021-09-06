package Lists;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Lion");
        animals.push("Tiger");
        animals.push("BlackBuck");
        animals.push("Salman");

        // System.out.println(animals);
        System.out.println(animals.pop()); // Salman

        // To get element at top
        System.out.println(animals.peek()); // BlackBuck
    }
}
