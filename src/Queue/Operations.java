package Queue;



public class Operations
{
    public static void main(String[] args)
    {
       Employee employee=new Employee("a","b",1);
        Employee employee1=new Employee("c","d",1);
       ArrayQueue arrayQueue=new ArrayQueue(3);

       arrayQueue.addToQueue(employee);
       arrayQueue.addToQueue(employee1);


       arrayQueue.removeFromQueue();

       arrayQueue.PrintQueue();

    }
}
