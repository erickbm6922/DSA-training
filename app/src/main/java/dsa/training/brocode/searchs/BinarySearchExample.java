package dsa.training.brocode.searchs;

import java.util.Arrays;

/*
 * Binary search = Search algorithm that finds the position of a target value within a sorted array.
 * Half of the array is eliminated during each "step"
 * @note runtime complexity: O(log n)
 * @note Disadvantages:
 *  Slow for large data sets
 * @note Advantages:
 *  Fast for searches of small to medium data sets
 *  Does not need to sorted
 *  Userful for DS that do not have randome access (LinkedList)
 * @author Erick Borda
 */
public class BinarySearchExample {
    public static void firstExample(int value) {
        int[] array = new int[100];
        int target = value;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int index = Arrays.binarySearch(array, value);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println(target + " not found");
        }

    }

    public static void ownBinarySearchExample(int value) {
        int[] array = new int[1000000];
        int target = value;
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        // int index = Arrays.binarySearch(array, value);

        int index = binarySearch(array, value);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println(target + " not found");
        }

    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            // Formula
            int middle = low + (high - low) / 2;
            int middleValue = array[middle];
            System.out.println("Middle value: " + middleValue);
            if (middleValue < target) {
                low = middle + 1;
            } else if (middleValue > target) {
                high = middle - 1;
            } else {
                // target found
                return middleValue;
            }

        }
        // target not found
        return -1;
    }
}
