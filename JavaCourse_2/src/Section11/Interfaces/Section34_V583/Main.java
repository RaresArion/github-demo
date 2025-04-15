package Section11.Interfaces.Section34_V583;

/*
*  This is the tutorial for Section 11 Ex47, found in Section 34 Videos 583-584
* */

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);

        list.traverse();

        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for (String s : data) {
            // System.out.print(s + " - ");
            list.addItem(new Node(s));
        }
//        list.traverse(list.getRoot());
        list.removeItem(new Node("Sydney"));
        System.out.println("-".repeat(30));
//        list.traverse();

        stringData = "9 1 0 2 8 4 3 7 4 5 6";
        data = stringData.split(" ");
        SearchTree tree = new SearchTree(null);
        for (String s : data) {
            // System.out.print(s + " - ");
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());


    }
}
