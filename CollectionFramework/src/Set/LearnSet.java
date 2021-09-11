package Set;

import java.util.Set;
import java.util.HashSet;

public class LearnSet {
    public static void main(String[] args) {
        // duplicate elemetn not allowed in set works on hashing
        // ordering is not defined, everytime you print order is random and new
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(11);
        set.add(56);
        set.add(3);
        set.add(76);

        System.out.println(set);

        set.remove(56);
        System.out.println(set);

        System.out.println(set.contains(100));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
}
