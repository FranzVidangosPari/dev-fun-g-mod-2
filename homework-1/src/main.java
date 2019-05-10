public class main {

    public static void main(String[] arg){
        CustomList newCustomList= new CustomList();
        newCustomList.add(5);
        newCustomList.add(9);
        newCustomList.add(29);
        newCustomList.addFirst(39);
        newCustomList.addLast(49);
        newCustomList.printList();

        System.out.println(" ");
        newCustomList.addIndex(3, 7);
        newCustomList.printList();

        System.out.println(" ");
        newCustomList.removeFirst();
        newCustomList.printList();

        System.out.println(" ");
        newCustomList.removeLast();
        newCustomList.printList();

        System.out.println(" ");
        newCustomList.removeIndex(2);
        newCustomList.printList();
    }
}
