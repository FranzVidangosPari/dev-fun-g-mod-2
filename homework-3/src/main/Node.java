public class Node<T> {
    T value;
    Node left;
    Node right;
    int heightLeft, heightRight;

    Node(T value){
        this.value = value;
        this.left = null;
        this.right = null;
        this.heightRight = 0;
        this.heightLeft = 0;
    }

    public int getHeightLeft(){
        return this.heightLeft;
    }

    public int getHeightRight(){
        return this.heightRight;
    }

}
