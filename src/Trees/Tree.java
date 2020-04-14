package Trees;

public class Tree
{
    private TreeNode root;

    public void insert(int value)
    {
        if(root==null){
            root=new TreeNode(value);
        }
        else{
            root.insert(value);
        }
    }
    public void traverseInOrder(){
        if(root!=null){
            root.traverseInOrder();
        }
    }
    public TreeNode get(int value){
        if(root!=null){
            return root.get(value);
        }
        return null;
    }
    public int min(){
        if(root!=null){
            return root.min();
        }
        else {
            return Integer.MIN_VALUE;
        }
    }
    public int max(){
        if(root!=null){
            return root.max();
        }
        return Integer.MAX_VALUE;
    }
    public void delete(int value)
    {
        root=delete(root,value);
    }
    private TreeNode delete(TreeNode subtreeroot,int value)
    {
        if(subtreeroot==null)
        {
            return subtreeroot;
        }
        if(value<subtreeroot.getData())
        {
            //go to left subtree
            subtreeroot.setLeftChild(delete(subtreeroot.getLeftChild(),value));
        }
        else if(value>subtreeroot.getData())
        {
           //go to right sub tree
           subtreeroot.setRightChild(delete(subtreeroot.getRightChild(),value));
        }
        else{
            if(subtreeroot.getRightChild()==null){
                return subtreeroot.getLeftChild();
            }
            else if(subtreeroot.getLeftChild()==null){
                return subtreeroot.getRightChild();
            }
            else{
                subtreeroot.setData(subtreeroot.getRightChild().min());
                subtreeroot.setRightChild(delete(subtreeroot.getRightChild(),subtreeroot.getData()));
            }
        }
        return subtreeroot;
    }
    public void traversePreOrder(){
        if(root!=null){
            root.traversePreOrder();
        }
    }
    public void traversePostOrder(){
        if(root!=null){
            root.traversePostOrder();
        }
    }
    public int height(){
        if(root!=null){
           return root.height(root);
        }
        return 0;
    }


}
