public class CustomStack<T> {
    CustomList<T> stack;

    public CustomStack(){
        stack = new CustomList<>();
    }
    void push(T value){
        stack.addFirst(value);
    }

    public T peek(){
        return stack.getByIndex(0);
    }

    void pop(){
        stack.removeFirst();
    }
}
