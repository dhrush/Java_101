package Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {

        // comment selection /* */ */ Shift + Alt + A

        // comment selection // Ctrl + /

        /*
         * ArrayList<Integer> students = new ArrayList<>(); students.add(1);
         * students.add(2); students.add(3); students.add(4); students.add(5);
         * students.add(6);
         * 
         * students.add(2, 22); // 2-->index, 22-->value System.out.println(students);
         * 
         * // add new List ArrayList<Integer> list2 = new ArrayList<>(); list2.add(10);
         * list2.add(20);
         * 
         * students.addAll(list2); // appends at the last // students.addAll(4, list2);
         * at index 4 System.out.println(students);
         * 
         * System.out.println(students.get(4));
         */

        List<Integer> l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);

        System.out.println(l1);

        l1.remove(1); // this removes element at index 1
        System.out.println(l1);

        l1.add(2, 30); // inserts 30 at index 2 l1= [10, 30, 30, 40]
        System.out.println(l1);

        l1.remove(Integer.valueOf(30)); // overloaded method removes the first element with value 30
        System.out.println(l1);

        l1.clear(); // clears the entire list
        System.out.println(l1);

        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        l1.add(80);

        l1.set(2, l1.get(2) * 100);
        System.out.println(l1);

        // check if it contain element with particular value
        boolean doContain = l1.contains(50);
        System.out.println(doContain);

        // traversing list
        // using loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.println("The element at index " + i + " is : " + l1.get(i));
        }

        // using for each
        for (Integer element : l1) {
            System.out.println("the element is: " + element);
        }

        // using iterator
        Iterator<Integer> it = l1.iterator();
        while (it.hasNext()) {
            System.out.println("The element at current iterator is: " + it.next());
        }

    }
}
