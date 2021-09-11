package Queue;

import java.util.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        // Queue<Integer> pq = new PriorityQueue<>();
        // pq.offer(40);
        // pq.offer(12);
        // pq.offer(24);
        // pq.offer(36);

        // // under the hood it implements min heap
        // System.out.println(pq); // pq=[12,36,24,40]

        // pq.poll(); // 12 gets removed

        // System.out.println(pq); // pq=[24, 36, 40]

        // System.out.println(pq.peek());

        /* To get max heap do: */
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(12);
        pq.offer(24);
        pq.offer(36);
        pq.offer(40);

        System.out.println(pq); // pq=[40,36,24,12]
        System.out.println(pq.poll()); // 40
        System.out.println(pq.peek()); // 36
        System.out.println(pq); // pq=[36,12,24]

    }
}
