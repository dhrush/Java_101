package Queue;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        // Array Deque can be used to implement stack
        adq.offer(1);
        adq.offer(2);
        adq.offer(3);
        adq.offerFirst(10);
        adq.offerLast(20);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println("adq poll: " + adq.poll());
        System.out.println("adq after poll: " + adq);

        System.out.println("adq poll first: " + adq.pollFirst());
        System.out.println("adq poll first: " + adq);

        System.out.println("adq poll last: " + adq.pollLast());
        System.out.println("adq after poll: " + adq);
    }
}
