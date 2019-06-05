import java.util.Objects;

public class CustomTree<T> {
    Node<T> root;

        public void add(T value){
            Node<T> newNode = new Node<>(value);
            this.addNode(newNode, this.root);
        }

        private void addNode(Node newNode, Node customRoot) {
            if (customRoot == null) {
                this.root = newNode;
            } else {
                if (newNode.value.hashCode() < customRoot.value.hashCode()) {
                    if (customRoot.left == null) {
                        customRoot.left = newNode;
                    } else {
                        addNode(newNode, customRoot.left);
                    }
                } else {
                    if (customRoot.right == null) {
                        customRoot.right = newNode;
                    } else {
                        addNode(newNode, customRoot.right);
                    }
                }
            }
        }

        public void print(){
            this.binaryTree(this.root);
        }

        private void binaryTree(Node customRoot) {
            if (customRoot != null) {
                System.out.println(customRoot.value);
                if (customRoot.left != null) {
                    binaryTree(customRoot.left);
                }
                if (customRoot.right != null) {
                    binaryTree(customRoot.right);
                }
            }
        }


}
