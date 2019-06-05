public class CustomStack<T> {
    CustomList<T> stack;

    public CustomStack(){
        stack = new CustomList<>();
    }

    /**
     * Add to the top of the Stack.
     * @param value value to add.
     */
    void push(T value){
        stack.addFirst(value);
    }

    /**
     * returns object on top of stack.
     * @return T
     */
    public T peek(){
        return stack.getByIndex(0);
    }

    /**
     * Remove from the top of the Stack.
     */
    void pop(){
        stack.removeFirst();
    }

    /**
     * Tests if queue is empty.
     * @return boolean
     */
    public boolean emptyStack(){
        return stack.emptyList();
    }
}
