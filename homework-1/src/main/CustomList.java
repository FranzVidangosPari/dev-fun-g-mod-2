public class CustomList<T> implements IList<T> {
    Node<T> head;
    Node<T> tail;

    @Override
    public void add(T value) {
        Node<T> newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * This method add the element in first place.
     * @param value is the vakue to add
     */
    @Override
    public void addFirst(T value) {
        Node<T> newNode=new Node(value);
        newNode.next = head;
        head = newNode;
        if (newNode.next == null){
            tail = newNode;
        }
    }

    @Override
    public void addLast(T value) {
        Node<T> newNode=new Node(value);
        if(tail == null){
            head = newNode;
        }
        else{
            tail.next = newNode;
        }
        tail = newNode;
    }

    @Override
    public void printList() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
    }

    @Override
    public void removeFirst() {
        if (head != null){
            head = head.next;
        }
        if (head == null){
            tail = null;
        }
    }


    @Override
    public void addIndex(int index,T element) {
        Node<T> newNode=new Node(element);
        Node current = head;
        for(int i = 0; i < index - 1 ; i++){
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    @Override
    public void removeLast() {
        if (head == null){
            return;
        }
        else {
            if (head.equals(tail)) {
                head = null;
                tail = null;
            }
            else {
                Node current = head;
                while(current.next != tail){
                    current = current.next;
                }
                tail = current;
                current.next = null;
            }
        }
    }

    @Override
    public void removeIndex(int index){
        Node current = head;
        for(int i=0; i < index-1; i++){
            current = current.next;
        }
        current.next = current.next.next;
        if (current.next == null) {
            tail = current;
        }
    }


    public boolean contains(T value){
        Node current = head;
        while(current != null){
            if(current.value == value){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     *
     * @param index
     * @return T is the value to return
     */
    public T getByIndex(int index){
        Node current = head;
        for(int i = 0; i < index ; i++){
            current = current.next;
        }
        return (T) current.value;
    }

    public boolean emptyList(){
        if(head == null && tail == null){
            return true;
        }
        return false;
    }
}
