package dsa.training.brocode.hashtables;

import java.util.Hashtable;

/*
 * hastable = a data strcucture that stores unique keys to values ex. <Integer, String>
 *            Each key/value pair is know as an Entry. Fast insertion, look up, deletion of key/value pairs
 *            Not ideal for small data sets, great with large data sets
 * hashing = takes a key and computes an integer (formula will vary based key and data type)
 *           In a hastable, we ise the % capacity to calculate an index number
 *           hey.hashCode() % capacity = index
 * 
 * bucket = and indexed storage location for one or more Entries can store multiple Entries in case of a collision
 *          (linked similarly a LinkedList)
 * 
 * collision = hash function generates the same index for more than one key less collisions = more efficiency
 * Runtime complexity: Best case O(1), Worst case O(n)
 * @author Erick Borda
 * 
 */
public class HashtableExample {

    public static void firstExample() {
        Hashtable<Integer, String> table = new Hashtable<>(10);
        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }

    }

    public static void secondExample() {
        Hashtable<String, String> table = new Hashtable<>(10);
        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() + "\t" + key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }

    }
}
