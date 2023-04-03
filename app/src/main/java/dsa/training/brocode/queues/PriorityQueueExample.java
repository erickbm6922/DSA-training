package dsa.training.brocode.queues;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/* Priority Queue example Brocode
Fifo Data structure that servers elements with the highest priorities 
first before elements with lower priority
enqueue,offer() to add
dequeue,poll to remove 
 * @author Erick Borda
 * @note Uses of stacks?
 *  1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
 *  2. Printer Queue (Print jobs should be completed in order)
 *  3. User in LinkedLists, PriorityQueues, Breadth-first search
 * @note Check web page https://www.youtube.com/watch?v=CBYHwZcbD-s&t=289s
 */
public class PriorityQueueExample {

    public static void firstExample() {
        Queue<Double> queue = new LinkedList<>();
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        System.out.println("-> Before remove");
        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("-> After remove");
        System.out.println(queue);

        System.out.println("=====================================================");
        System.out.println("============== Priority Queue Example ==============");
        System.out.println("=====================================================");
        queue = new PriorityQueue<>();
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        System.out.println("-> Before remove");
        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("-> After remove");
        System.out.println(queue);

    }

    public static void reverseOrderExample() {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        System.out.println("-> Before remove");
        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("-> After remove");
        System.out.println(queue);
    }

    public static void stringOrderExample() {
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        System.out.println("-> Before remove");
        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("-> After remove");
        System.out.println(queue);
    }

    public static void stringReverseOrderExample() {
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        System.out.println("-> Before remove");
        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        System.out.println("-> After remove");
        System.out.println(queue);
    }

}
