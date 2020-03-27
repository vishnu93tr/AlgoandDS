package Lists.DoubleLinkedList;

public class Main
{
    public static void main(String[] args)
    {
        Employee virat=new Employee("a","1",1);
        Employee steve=new Employee("b","2",2);
        Employee root=new Employee("c","3",3);
        Employee kane=new Employee("d","4",4);

        EmployeeDoublyLinkedList employeeLinkedList=new EmployeeDoublyLinkedList();
        employeeLinkedList.addToFront(virat);
        employeeLinkedList.addToEnd(steve);
        employeeLinkedList.printList();


        employeeLinkedList.removeFromEnd();
        employeeLinkedList.printList();



    }
}
