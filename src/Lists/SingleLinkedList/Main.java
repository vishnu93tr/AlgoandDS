package Lists.SingleLinkedList;

public class Main
{
    public static void main(String[] args)
    {
        Employee virat=new Employee("virat","kohli",1);
        Employee steve=new Employee("steve","smith",2);
        Employee root=new Employee("joe","root",3);
        Employee kane=new Employee("kane","williamson",4);

        EmployeeLinkedList employeeLinkedList=new EmployeeLinkedList();
        System.out.println(employeeLinkedList.isEmpty());
        employeeLinkedList.addToFront(virat);
        employeeLinkedList.addToFront(steve);
        employeeLinkedList.addToFront(root);
        employeeLinkedList.addToFront(kane);
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.printlist();

        employeeLinkedList.removeFromFront();
        System.out.println(employeeLinkedList.getSize());
        employeeLinkedList.printlist();
    }
}
