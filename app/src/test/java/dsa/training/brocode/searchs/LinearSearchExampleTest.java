package dsa.training.brocode.searchs;

import org.junit.jupiter.api.Test;

public class LinearSearchExampleTest {

    @Test
    void testExistingValueExample() {
        LinearSearchExample.firstExample(3);
    }

    @Test
    void testNotExistingValueExample() {
        LinearSearchExample.firstExample(20);
    }
}
