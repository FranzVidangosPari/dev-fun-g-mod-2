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

        public void heightTest(){
            this.height(this.root);
        }

        public void height(Node customRoot){
            if (customRoot.left != null){
                height(customRoot.left);
                customRoot.heightLeft = customRoot.left.getHeightLeft() + 1;
                this.balanceFactor(customRoot);
            }
            if (customRoot.right != null){
                height(customRoot.right);
                customRoot.heightRight = customRoot.right.getHeightRight() + 1;
                this.balanceFactor(customRoot);
            }
        }

    public void balanceFactorTest(){
        this.balanceFactor(this.root);
    }

    public void balanceFactor(Node customRoot){
        int balance = customRoot.getHeightRight() - customRoot.getHeightLeft();
        if (balance == 1 || balance == 0 || balance == -1 ){
            System.out.println("balance");
        }
        else{System.out.println("no balance");
        //giro izquierda if balance es positivo
            if (customRoot.right.left == null){
                Node<T> newNode = new Node(customRoot.value);
                //newNode.right = customRoot.right
                //newNode.left = customRoot.left
                customRoot.right.left = newNode;
                this.height(customRoot.right);
                // si customRoot.right.left != null moverlo al lado derecho
                // eliminar customRoot, caso especial verificar si es root
            }

        }
    }


        public void print(){
            this.binaryTree(this.root);
        }

        private void binaryTree(Node customRoot) {
            if (customRoot != null) {
                System.out.println(customRoot.value);
                System.out.println(customRoot.getHeightLeft()+" "+customRoot.getHeightRight() );
                //this.balanceFactor(customRoot);
                if (customRoot.left != null) {
                    binaryTree(customRoot.left);
                }
                if (customRoot.right != null) {
                    binaryTree(customRoot.right);
                }
            }
        }


}
