package Lists.DoubleLinkedList;

public class EmployeeDoublyLinkedList
{
    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public int getSize()
    {
        return size;
    }
    public void addToFront(Employee employee)
    {
        EmployeeNode employeeNode=new EmployeeNode(employee);
        if(head==null)
        {
            tail=employeeNode;
        }
        else{
            head.setPrevious(employeeNode);
            employeeNode.setNext(head);
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
        else{
            tail.setNext(employeeNode);
            employeeNode.setPrevious(tail);
        }
        tail=employeeNode;
        size++;
    }
    public boolean addBefore(Employee newEmployee,Employee existingEmployee)
    {
        if(head==null){
            return false;
        }
        EmployeeNode current=head;
        if(current!=null && !current.getEmployee().equals(existingEmployee))
        {
            current=current.getNext();
        }
        if(current.equals(head))
        {
            addToFront(newEmployee);
        }
        else {
            EmployeeNode newEmp = new EmployeeNode(newEmployee);
            newEmp.setPrevious(current.getPrevious());
            newEmp.setNext(current);
            newEmp.getPrevious().setNext(newEmp);
            current.setPrevious(newEmp);
        }
        return true;
    }
    public EmployeeNode removeFromFront()
    {
        EmployeeNode removedNode=head;
        if(head==null)
        {
            return null;
        }
        if(head.getNext()==null){
            tail=null;
        }
        else {
            head.getNext().setPrevious(null);
        }
        head=head.getNext();
        size--;
        return removedNode;
    }
    public EmployeeNode removeFromEnd()
    {
        EmployeeNode removedNode=tail;
        if(tail==null)
        {
            return null;
        }
        if(tail.getPrevious()==null){
            head=null;
        }
        else{
            tail.getPrevious().setNext(null);
        }
        tail=tail.getPrevious();
        size--;
        return removedNode;
    }
    public void printList()
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
