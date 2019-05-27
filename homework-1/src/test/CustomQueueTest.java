import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class CustomQueueTest {

    @Test
    public void add() {
        CustomQueue<String> newQueueList = new CustomQueue<>();
        newQueueList.add("5");
        assertEquals("5", newQueueList.peek());
    }

    @Test
    public void peek() {
        CustomQueue<String> newQueueList = new CustomQueue<>();
        newQueueList.add("5");
        newQueueList.add("11");
        newQueueList.add("34");
        assertEquals("5", newQueueList.peek());
    }

    @Test
    public void remove() {
        CustomQueue<String> newQueueList = new CustomQueue<>();
        newQueueList.add("5");
        newQueueList.remove();
        assertEquals(true, newQueueList.emptyQueue());
    }
}