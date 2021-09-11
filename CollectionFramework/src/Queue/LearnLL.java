package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class LearnLL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30); // offer-> insert elements to queue
        System.out.println(q);
        System.out.println(q.peek()); // peek -> returns element to be removed next
        System.out.println(q.poll()); // poll -> deletes and returns element to be removed
        System.out.println(q);
    }
}
