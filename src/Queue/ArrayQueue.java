package Queue;

import java.util.NoSuchElementException;

public class ArrayQueue
{
    private Employee[] queue;
    private int front;
    private int back;

    //back to add
    //front to remove
    //front=1 back=2
    //front=2,back=1

    public ArrayQueue(int capacity)
    {
        queue=new Employee[capacity];
    }
    public int size()
    {
        if(front<=back){
            return back-front;
        }
        else{
            return back-front+queue.length;
        }
    }
    public void PrintQueue()
    {
        if(front<=back){
            for(int i=front;i<back;i++){
                System.out.println(queue[i]);
            }
        }
        else{
           for(int i=0;i<back;i++){
               System.out.println(queue[i]);
           }
           for(int i=front;i<queue.length;i++){
               System.out.println(queue[i]);
           }
        }
    }
    //0-jane
    //1-john
    //2-      back
    //3-smith-front
    //4-ruby


    //smith- front
    //ruby
    //jane
    //john
    //     back
   public void addToQueue(Employee employee){
        //we will add employee to back
       if(size()==queue.length-1)
       {
           int numItems=queue.length;
           Employee[] newArray=new Employee[2*queue.length];
           System.arraycopy(queue,front,newArray,0,queue.length-front);
           System.arraycopy(queue,0,newArray,queue.length-front,back);
           queue=newArray;
           front=0;
           back=numItems;
       }
       queue[back]=employee;
       if(back<queue.length-1){
           back++;
       }
       else{
           back=0;
       }
   }
   public Employee removeFromQueue()
   {
        //we remove employees from front
       if(size()==0){
           throw  new NoSuchElementException();
       }
       Employee employee=queue[front];
       queue[front]=null;
       front++;
       if(size()==0)
       {
            front=0;
            back=0;
       }
       else if(front==queue.length){
           front=0;
       }
       return employee;
   }
   public Employee peek()
   {
       if(size()==0){
           throw new NoSuchElementException();
       }
       return queue[front];

   }
}
