public interface IList<T> {
    void add(T value);
    void printList();
    void removeFirst();
    void addFirst(T value);
    void addLast(T value);
    void addIndex(int index,T element);
    void removeIndex(int index);
    void removeLast();
}
