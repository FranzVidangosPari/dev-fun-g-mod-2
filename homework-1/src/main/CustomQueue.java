public class CustomQueue<T> {

    CustomList<T> queue;

    public CustomQueue(){
        queue = new CustomList<>();
    }
    void add(T value){
        queue.addLast(value);
    }

    public T peek(){
        return queue.getByIndex(0);
    }

    void remove(){
        queue.removeFirst();
    }
}
