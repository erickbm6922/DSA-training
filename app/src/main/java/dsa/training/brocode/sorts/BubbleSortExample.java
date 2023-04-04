package dsa.training.brocode.sorts;

/*
 * Bubble sort = pairs of adjacent elements are compared, and the elements swapped if they are not in order.
 * @note complexity: O(n^2) small data set = okay-ish, large data set = bad
 * @author Erick Borda
 */
public class BubbleSortExample {

    public static void firstExample() {
        int array[] = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
        System.out.println("-> Before sort");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        bubbleSort(array);
        System.out.println("\n-> After sort");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
