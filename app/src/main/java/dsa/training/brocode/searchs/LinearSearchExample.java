package dsa.training.brocode.searchs;

/*
 * Linear search = Iterate through a collection one element at the time
 * @note runtime complexity: O(n)
 * @note Disadvantages:
 *  Slow for large data sets
 * @note Advantages:
 *  Fast for searches of small to medium data sets
 *  Does not need to sorted
 *  Userful for DS that do not have randome access (LinkedList)
 * @author Erick Borda
 */
public class LinearSearchExample {

    public static void firstExample(int value) {
        int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
        int index = linearSearch(array, value);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

    }

    private static int linearSearch(int[] array, int value) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == value) {
                return j;
            }
        }
        return -1;
    }
}
