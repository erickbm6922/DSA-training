package dsa.training.brocode.sorts;

/*
 * Quick sort = moves smaller elments to left of a pivot recursively divde array in 2 partitions
 * @note run-time complexity = best case O(n log (n)) Average case O(n log(n)), Worst case O(n^2) if already sorted
 * @note space-complexoty = O(log(n)) due to recursion
 */
public class QuickSortExample {

    public static void firstExample() {

        int[] array = { 8, 2, 5, 3, 9, 7, 6, 1 };
        System.out.println("-> Before Sort");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        quickSort(array, 0, array.length - 1);

        System.out.println("\n-> After Sort");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    private static void quickSort(int[] array, int start, int end) {
        if (end <= start)
            return;

        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;

    }

}
