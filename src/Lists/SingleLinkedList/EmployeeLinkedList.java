package Lists.SingleLinkedList;

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
    public void addToEnd(Employee employee)
    {
        EmployeeNode employeeNode=new EmployeeNode(employee);
        EmployeeNode last=head;
        while(last.getNext()!=null)
        {
           last=last.getNext();
           last.setNext(employeeNode);
           employeeNode.setNext(null);
        }
        size++;
    }
    public void addToSpecific(Employee employee,int position)
    {
        if(position==0){
            addToFront(employee);
        }
        else {
            EmployeeNode new_node = new EmployeeNode(employee);
            int index = 0;
            EmployeeNode current = head;
            while (index < position - 1) {
                current = current.getNext();
                index++;
            }
            new_node.setNext(current.getNext());
            current.setNext(new_node);
        }
    }
    public void removefromSpecific(EmployeeNode head,int position)
    {
        if(head==null){
            return;
        }
        if(position==0){
            removeFromFront();
        }
        else{
            EmployeeNode current=head;
            int counter=0;
            while(counter<position-1){
                current=current.getNext();
            }
            System.out.println(current);
            current.setNext(current.getNext().getNext());
        }
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
