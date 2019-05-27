import org.junit.Test;

import static org.junit.Assert.*;

public class CustomStackTest {

    @Test
    public void push() {
        CustomStack<String> newStackList = new CustomStack<>();
        newStackList.push("5");
        assertEquals("5", newStackList.peek());
    }

    @Test
    public void peek() {
        CustomStack<String> newStackList = new CustomStack<>();
        newStackList.push("5");
        newStackList.push("12");
        newStackList.push("37");
        assertEquals("37", newStackList.peek());
    }

    @Test
    public void pop() {
        CustomStack<String> newStackList = new CustomStack<>();
        newStackList.push("5");
        newStackList.pop();
        assertEquals(true, newStackList.emptyStack());
    }
}