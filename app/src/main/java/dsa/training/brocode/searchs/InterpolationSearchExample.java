package dsa.training.brocode.searchs;

/*
 * Interpolation search = Improvement over binary search best user for "uniformly" distributed data.
 * "Guesses" where a value might be based on calculated probe results if probe is incorrect, search
 * area is narrowed, and new probe is calculated
 * @note runtime average case: O(log(log(n)))
 *               worst case: O(n) [values increase exponentially]
 * @note Disadvantages:
 *  Slow for large data sets
 * @note Advantages:
 *  Fast for searches of small to medium data sets
 *  Does not need to sorted
 *  Userful for DS that do not have randome access (LinkedList)
 * @author Erick Borda
 */
public class InterpolationSearchExample {
    public static void firstExample(int value) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = value;

        int index = interpolationSearch(array, value);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println(target + " not found");
        }

    }

    public static void secondExample(int value) {
        int[] array = { 1, 2, 4, 16, 32, 64, 128, 256, 512, 1024 };
        int target = value;

        int index = interpolationSearch(array, value);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println(target + " not found");
        }

    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length - 1;
        int low = 0;

        while (value >= array[low] && value <= array[high] && low <= high) {
            // Formula
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]);
            System.out.println("Probe: " + probe);
            if (array[probe] == value) {
                return probe;
            } else if (array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }

        return -1;
    }

}
