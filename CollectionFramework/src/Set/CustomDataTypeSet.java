package Set;

//import Set.Student;

import java.util.Set;
import java.util.HashSet;

public class CustomDataTypeSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Dhruv", 1));
        studentSet.add(new Student("Ayush", 2));
        studentSet.add(new Student("Naman", 3));

        System.out.println(studentSet);
    }
}
