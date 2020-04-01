package HashTable;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class Challenge2
{
    public static void main(String[] args)
    {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        Map<Integer,Employee> map=new HashMap<>();
        for(Employee employee:employees)
        {
            if(!map.containsKey(employee.getId()))
            {
                map.put(employee.getId(), employee);
            }
        }

        LinkedList<Employee> withoutduplicates=new LinkedList<>(map.values());
        for(Employee employee:withoutduplicates)
        {
            System.out.println(employee);
        }

    }
}
