package Lists.DoubleLinkedList;

public class EmployeeDoublyLinkedList
{
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;
    public void addToFront(Employee employee)
    {
        EmployeeNode employeeNode=new EmployeeNode(employee);
        employeeNode.setNext(head);
        //condition for empty doubly linked list
        if(head==null){
            tail=employeeNode;
        }
        else{
            head.setPrevious(employeeNode);
        }
        head=employeeNode;
        size++;
    }
    public void addToEnd(Employee employee)
    {
        EmployeeNode employeeNode=new EmployeeNode(employee);
        if(tail==null)
        {
            head=employeeNode;
        }
        else
        {
            tail.setNext(employeeNode);
            employeeNode.setPrevious(tail);
        }
        tail=employeeNode;
        size++;
    }
    public boolean isEmpty()
    {
        return head==null;
    }
    public int getSize()
    {
        return size;
    }

    public EmployeeNode removeFromFront()
    {
        if(isEmpty())
        {
            return null;
        }
        EmployeeNode removedNode=head;
        //john previous field becomes janes previous
        if(head.getNext()==null)
        {
            tail=null;
        }
        else {
            head.getNext().setPrevious(null);
        }
        head=head.getNext();
        size--;
        return removedNode;
    }
    //john,jane
    //jane
    public EmployeeNode removeFromEnd()
    {
        if(isEmpty()){
            return null;
        }
        EmployeeNode removedNode=tail;
        if(tail.getPrevious()==null)
        {
            head=null;
        }
        else
            {
            tail.getPrevious().setNext(null);
        }
        tail=tail.getPrevious();
        size--;
        return removedNode;
    }
    public void printlist()
    {
        EmployeeNode current=head;
        System.out.print("HEAD->");
        while (current!=null)
        {
            System.out.print(current);
            System.out.print("<->");
            current=current.getNext();

        }
        System.out.println("null");

    }
}
