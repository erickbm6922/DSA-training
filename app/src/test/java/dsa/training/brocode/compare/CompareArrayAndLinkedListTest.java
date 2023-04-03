package dsa.training.brocode.compare;

import org.junit.jupiter.api.Test;

public class CompareArrayAndLinkedListTest {
    @Test
    void testCompareGetExample() {
        CompareArrayAndLinkedList.compareGetExample();
    }

    @Test
    void testCompareGetSpecificValueExample() {
        CompareArrayAndLinkedList.compareGetSpecificValueExample(500000);
    }

    @Test
    void testCompareGetLastValueExample() {
        CompareArrayAndLinkedList.compareGetSpecificValueExample(999999);
    }

    @Test
    void testCompareRemoveFirstExample() {
        CompareArrayAndLinkedList.compareRemoveFirstExample();
    }

    @Test
    void testCompareRemoveSpecificValueExample() {
        CompareArrayAndLinkedList.compareRemoveSpecificValueExample(500000);
    }

    @Test
    void testCompareRemoveLastExample() {
        CompareArrayAndLinkedList.compareRemoveSpecificValueExample(999999);
    }

}
