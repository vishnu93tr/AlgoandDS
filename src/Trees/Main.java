package Trees;

public class Main
{
    public static void main(String[] args)
    {
        Tree tree=new Tree();
        tree.insert(20);
        tree.insert(35);
        tree.insert(15);

        tree.traverseInOrder();

        tree.traversePreOrder();

        tree.traversePostOrder();
    }
}
