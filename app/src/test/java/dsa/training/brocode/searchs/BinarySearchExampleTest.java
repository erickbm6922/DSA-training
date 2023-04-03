package dsa.training.brocode.searchs;

import org.junit.jupiter.api.Test;

public class BinarySearchExampleTest {
    @Test
    void testExistingValueExample() {
        BinarySearchExample.firstExample(42);
    }

    @Test
    void testNotExistingValueExample() {
        BinarySearchExample.firstExample(200);
    }

    @Test
    void testExistingValueOwnBinarySearchExample() {
        BinarySearchExample.ownBinarySearchExample(777777);
    }

}
