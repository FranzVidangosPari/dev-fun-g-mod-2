import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomListTest {

    @Test
    public void add() {
        CustomList<String> newCustomList= new CustomList<>();
        newCustomList.add("5");
        assertEquals("5",newCustomList.getByIndex(0));
    }

    @Test
    public void addFirst() {
    }

    @Test
    public void addLast() {
    }

    @Test
    public void printList() {
    }

    @Test
    public void removeFirst() {
    }

    @Test
    public void addIndex() {
    }

    @Test
    public void removeLast() {
    }

    @Test
    public void removeIndex() {
    }

    @Test
    public void contains() {
    }

    @Test
    public void getByIndex() {
    }
}