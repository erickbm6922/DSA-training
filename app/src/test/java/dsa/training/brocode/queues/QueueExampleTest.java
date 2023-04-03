package dsa.training.brocode.queues;

import org.junit.jupiter.api.Test;

public class QueueExampleTest {
    @Test
    void testExampleRemove() {
        QueueExample.addExample();
    }

    @Test
    void testExamplePeek() {
        QueueExample.peekExample();
    }

    @Test
    void testRemovePeek() {
        QueueExample.removeExample();
    }
}
