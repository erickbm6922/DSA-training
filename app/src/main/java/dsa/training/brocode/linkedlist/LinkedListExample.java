package dsa.training.brocode.linkedlist;

import java.util.LinkedList;

/* LinkedList example Brocode
Stores Nodes in 2 parts (data + address)
Nodes are in non-consecutive memory locations
Elements are linked using pointers
                Singly Linked List
    Node                Node                Node
[data | address] -> [data | address] -> [data | address]
                Doubly Linked List
            Node                          Node            
[address | data | address] <-> [address | data | address]

 * @author Erick Borda
 * @note Advantages?
 *  1. Dynamic  Data structures (allocates needed memory while running)
 *  2. Insertion and Deletion of Nodes is easy. O(1)
 *  3. No/Low memory waste
 * @note Disadvantages?
 *  1. Greater memory usage (aditional pointer).
 *  2. No random access of elements (no index[i])
 *  3. Accessing/searching elements is more time consuming. O(n)
 * @note uses?
 *  1. Implement Stacks /Queues
 *  2. GPS navigation
 *  3. music playlist
 * 
 * @note Check web page https://www.youtube.com/watch?v=CBYHwZcbD-s&t=289s
 */
public class LinkedListExample {

    public static void firstExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        /**
         * =======================
         * Behaving like stack
         * ========================
         **/
        System.out.println(linkedList);

    }

    public static void popExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        linkedList.pop();
        System.out.println(linkedList);

    }

    public static void offerExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        System.out.println(linkedList);

    }

    public static void pollExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        System.out.println("-> Before remove");
        System.out.println(linkedList);
        System.out.println(linkedList.poll());

        System.out.println("-> Before remove");
        System.out.println(linkedList);

    }

    public static void insertExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add("E");
        System.out.println(linkedList);
    }

    public static void insertIndexExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");
        System.out.println(linkedList);
    }

    public static void removeExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");
        System.out.println("-> Before remove");
        System.out.println(linkedList);
        linkedList.remove("E");
        System.out.println("-> After remove");
        System.out.println(linkedList);
    }

    public static void getElementWithPeekExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        System.out.println(linkedList);
    }

    public static void addFirstExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");

        System.out.println(linkedList);
    }

    public static void addLastExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addLast("0");

        System.out.println(linkedList);
    }

    public static void removeFirstExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");

        System.out.println(linkedList);

        System.out.println("First Element: " + linkedList.removeFirst());
        System.out.println("-> After remove");
        System.out.println(linkedList);
    }

    public static void removeLastExample() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4, "E");
        linkedList.remove("E");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");

        System.out.println(linkedList);

        System.out.println("Last element: " + linkedList.removeLast());
        System.out.println("-> After remove");
        System.out.println(linkedList);
    }

}
