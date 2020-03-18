package Lists;

public class EmployeeLinkedList
{
    private EmployeeNode head;
    private int size;
    public void addToFront(Employee employee)
    {
        EmployeeNode employeeNode=new EmployeeNode(employee);
        employeeNode.setNext(head);
        head=employeeNode;
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
        head=head.getNext();
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
            System.out.print("-->");
            current=current.getNext();

        }
        System.out.println("null");

    }
}
