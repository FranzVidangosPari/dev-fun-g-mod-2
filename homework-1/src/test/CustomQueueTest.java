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
    }

    @Test
    public void remove() {
    }
}