package Lists.SinglyLinkedList_Integers;

public class IntegerLinkedList {

    private IntegerNode head;
    private int size;

    public void addToFront(Integer value) {
        IntegerNode node = new IntegerNode(value);
        node.setNext(head);
        head = node;
        size++;
    }

    public IntegerNode removeFromFront()
    {
        if (isEmpty()) {
            return null;
        }

        IntegerNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    //1,2,3,5,8
    //4=value to insert
    public void insertSorted(Integer value)
    {
        // add your code here
        if(head==null || head.getValue()>=value)
        {
            addToFront(value);
            return;
        }
        //find the insertion position
        IntegerNode current=head.getNext();
        IntegerNode previous=head;
        while(current!=null && current.getValue()<=value)
        {
            previous=current;
            current=current.getNext();
        }
        IntegerNode newNode=new IntegerNode(value);
        newNode.setNext(current);
        previous.setNext(newNode);
        size++;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        IntegerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
