package Trees;

public class Main
{
    public static void main(String[] args)
    {
        Tree tree=new Tree();
        tree.insert(20);
        tree.insert(35);
        tree.insert(15);
        tree.insert(55);
        tree.insert(45);

//        tree.traverseInOrder();
//
//        tree.traversePreOrder();
//
//        tree.traversePostOrder();

        System.out.println(tree.height());
    }
}
