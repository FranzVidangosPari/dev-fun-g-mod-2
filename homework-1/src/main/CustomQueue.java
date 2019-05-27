public class CustomQueue<T> {

    CustomList<T> queue;

    public CustomQueue(){
        queue = new CustomList<>();
    }

    /**
     * Insert at the rear of the Queue.
     * @param value value to add
     */
    void add(T value){
        queue.addLast(value);
    }

    /**
     * Returns object at front of queue
     * @return T
     */
    public T peek(){
        return queue.getByIndex(0);
    }

    /**
     * Remove from the front of the Queue
     */
    void remove(){
        queue.removeFirst();
    }

    /**
     * Tests if queue is empty
     * @return boolean
     */
    public boolean emptyQueue(){
        return queue.emptyList();
    }

}
