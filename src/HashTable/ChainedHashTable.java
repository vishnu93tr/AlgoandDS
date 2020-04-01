package HashTable;

import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashTable
{
    private LinkedList<StoredEmployee>[] hashtable;

    public void put(String key,Employee employee)
    {
        int hashKey=hashKey(key);
        hashtable[hashKey].add(new StoredEmployee(key,employee));
    }
    public Employee remove(String key)
    {
        int hashKey=hashKey(key);
        ListIterator<StoredEmployee> employeeListIterator=hashtable[hashKey].listIterator();
        int index=-1;
        StoredEmployee employee=null;
        while (employeeListIterator.hasNext())
        {
            employee=employeeListIterator.next();
            index++;
            if(employee.key.equals(key)){
                break;
            }
        }
        if(employee==null && !employee.key.equals(key)){
            return null;
        }
        else{
            hashtable[hashKey].remove(index);
            return employee.employee;
        }
    }
    public Employee get(String key)
    {
        int hashKey=hashKey(key);
        ListIterator<StoredEmployee> employeeListIterator=hashtable[hashKey].listIterator();
        StoredEmployee employee=null;
        while (employeeListIterator.hasNext())
        {
            employee=employeeListIterator.next();
            if(employee.key.equals(key)){
                return employee.employee;
            }

        }
        return null;
    }
    public void PrintHashTable()
    {
        for(int i=0;i<hashtable.length;i++)
        {
            if(hashtable[i].isEmpty())
            {
                System.out.println("empty");
            }
            ListIterator<StoredEmployee> employeeListIterator=hashtable[i].listIterator();
            while (employeeListIterator.hasNext()){
                System.out.print(employeeListIterator.next().employee);
                System.out.print("->");
            }
            System.out.println("null");
        }
    }
    public int hashKey(String key)
    {
        return key.length()%hashtable.length;
    }
}
