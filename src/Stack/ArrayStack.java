package Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class ArrayStack
{
    //This stack is backed by array
   private Employee[] stack;
   private int top;

   //constructor for declaring stack size
    public ArrayStack(int capacity)
    {
        stack=new Employee[capacity];
    }

   //push to stack
    public void push(Employee employee)
    {
        if(top==stack.length)
        {
            Employee[] newArray=new Employee[2*stack.length];
            System.arraycopy(newArray,0,stack,0,stack.length);
            stack=newArray;
        }
        stack[top++]=employee;
    }
    //pop from stack
    public Employee pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
       Employee employee= stack[--top];
       stack[top]=null;
       return employee;

    }
    //peek from stack
    public Employee peek()
    {
        if(isEmpty())
        {
            throw  new EmptyStackException();
        }
        return stack[top-1];
    }
    public boolean isEmpty(){
        return top==0;
    }
    public void printStack(){
        for(int i=top-1;i>=0;i--)
        {
            System.out.println(stack[i]);
        }
    }

}
