package Set;

import java.util.Set;
//import java.util.HashSet;
import java.util.LinkedHashSet;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        // order is maintained
        Set<Integer> set = new LinkedHashSet<>();
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

        set.add(56);
    }
}
