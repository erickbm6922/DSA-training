package dsa.training.brocode.queues;

import java.util.LinkedList;
import java.util.Queue;

/* Queue example Brocode
Fifo Data structure, a collection designed for holding elements prior to processing
linear data structure
enqueue,offer() to add
dequeue,poll to remove 
 * @author Erick Borda
 * @note Uses of stacks?
 *  1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
 *  2. Printer Queue (Print jobs should be completed in order)
 *  3. User in LinkedLists, PriorityQueues, Breadth-first search
 * @note Check web page https://www.youtube.com/watch?v=CBYHwZcbD-s&t=289s
 */
public class QueueExample {

    public static void addExample() {

        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);

    }

    public static void peekExample() {

        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue.peek());

        System.out.println(queue);

    }

    public static void removeExample() {

        Queue<String> queue = new LinkedList<>();
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println("-> before remove");
        System.out.println(queue);
        queue.poll();
        queue.poll();
        System.out.println("-> after remove");
        System.out.println(queue);

    }

}
