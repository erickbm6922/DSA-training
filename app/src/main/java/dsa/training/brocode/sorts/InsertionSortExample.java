package dsa.training.brocode.sorts;

/*
 * Insertion sort = after comparing elements to the left shift elements to the right to make 
 * insert a value
 * @note Quadratic time O(n^2) 
 * small data set = decent
 * large data set = BAD
 * Less steps than Bubble sort
 * Best case is O(n) compared to Selection Sort O(n^2)
 */
public class InsertionSortExample {
    public static void firstExample() {
        int array[] = { 9, 1, 8, 2, 7, 3, 6, 5, 4 };
        System.out.println("-> Before sort");
        for (int i : array) {
            System.out.print(i + " ");
        }
        insertionSort(array);
        System.out.println("\n-> After sort");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
