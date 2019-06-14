public class main {
    public static void main(String[] arg){
        CustomTree<String> newCustomTree = new CustomTree<>();
        newCustomTree.add("25");
        newCustomTree.add("50");
        newCustomTree.add("75");
        newCustomTree.heightTest();
        newCustomTree.print();

    }
}
