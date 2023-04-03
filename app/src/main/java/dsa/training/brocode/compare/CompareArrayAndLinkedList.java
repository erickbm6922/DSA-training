package dsa.training.brocode.compare;

import java.util.ArrayList;
import java.util.LinkedList;

public class CompareArrayAndLinkedList {

    public static void compareGetExample() {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime, endTime, elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // #region LinkedList
        startTime = System.nanoTime();
        linkedList.get(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList: \t" + elapsedTime + " ns");
        // #endregion

        // #region ArrayList
        startTime = System.nanoTime();
        arrayList.get(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList: \t" + elapsedTime + " ns");
        // #endregion

    }

    public static void compareGetSpecificValueExample(int value) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime, endTime, elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // #region LinkedList
        startTime = System.nanoTime();
        linkedList.get(value);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList: \t" + elapsedTime + " ns");
        // #endregion

        // #region ArrayList
        startTime = System.nanoTime();
        arrayList.get(value);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList: \t" + elapsedTime + " ns");
        // #endregion

    }

    public static void compareRemoveFirstExample() {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime, endTime, elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // #region LinkedList
        startTime = System.nanoTime();
        linkedList.remove(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList: \t" + elapsedTime + " ns");
        // #endregion

        // #region ArrayList
        startTime = System.nanoTime();
        arrayList.remove(0);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList: \t" + elapsedTime + " ns");
        // #endregion

    }

    public static void compareRemoveSpecificValueExample(int value) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime, endTime, elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // #region LinkedList
        startTime = System.nanoTime();
        linkedList.remove(value);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList: \t" + elapsedTime + " ns");
        // #endregion

        // #region ArrayList
        startTime = System.nanoTime();
        arrayList.remove(value);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList: \t" + elapsedTime + " ns");
        // #endregion

    }

}
