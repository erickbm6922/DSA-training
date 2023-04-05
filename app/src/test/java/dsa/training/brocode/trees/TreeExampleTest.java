package dsa.training.brocode.trees;

import org.junit.jupiter.api.Test;

public class TreeExampleTest {
    @Test
    void testBSTDisplayExample() {
        TreeExample.binarySearchTreeDisplayExample();
    }

    @Test
    void testBSTSearchInCorrectExample() {
        TreeExample.binarySearchTreeSearchExample(10);
    }

    @Test
    void testBSTSearchCorrectExample() {
        TreeExample.binarySearchTreeSearchExample(4);
    }

    @Test
    void testBSTSearchRemoveInCorrectExample() {
        TreeExample.binarySearchTreeRemoveExample(0);
    }

    @Test
    void testBSTSearchRemoveCorrectExample() {
        TreeExample.binarySearchTreeRemoveExample(9);
    }
}
