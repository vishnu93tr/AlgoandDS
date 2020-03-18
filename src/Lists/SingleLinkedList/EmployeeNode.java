package Lists.SingleLinkedList;

public class EmployeeNode
{
    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(Employee employee)
    {
        this.employee=employee;
    }


    public EmployeeNode getNext()
    {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
