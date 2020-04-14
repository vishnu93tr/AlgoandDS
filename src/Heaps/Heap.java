package Heaps;

import java.util.NoSuchElementException;

public class Heap
{
    public static int[] heap;
    public int size;

    public Heap(int capacity)
    {
        heap=new int[capacity];
    }
    public boolean isFull(){
        return size==heap.length;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public static int getChild(int index,boolean left)
    {
        return (2*index)+(left?1:2);
    }
    public int getParent(int index){
        return (index-1)/2;
    }
    public void insert(int value){
        if(isFull()){
            throw new IndexOutOfBoundsException();
        }
        heap[size]=value;
        fixHeapAbove(size);
        size++;
    }
    private void fixHeapAbove(int index)
    {
        int newValue=heap[index];

        while (index>0 && newValue>heap[getParent(index)])
        {
            //swap new value to parent
            heap[index]=heap[getParent(index)];
            index=getParent(index);
        }
        heap[index]=newValue;
    }
    public int delete(int index)
    {
        if(isEmpty()){
            throw  new IndexOutOfBoundsException("Heap is empty");
        }
        //get parent of item to be deleted
        int parent=getParent(index);

        int deletedvalue=heap[index];
        //replacement value should be always right most value ie.size-1
        heap[index]=heap[size-1];

        if(index==0 || heap[index]<heap[parent]){
            fixHeapBelow(index,size-1);
        }
        else{
            fixHeapAbove(index);
        }
        size--;
        return deletedvalue;
    }
    public int peek(){
        if(isEmpty()){
            throw new NoSuchElementException("Heap is empty");
        }
        return heap[0];
    }
    public void sort()
    {
        int lastHeapIndex=size-1;
        for(int i=0;i<lastHeapIndex;i++){
            int temp=heap[0];
            heap[0]=heap[lastHeapIndex-i];
            heap[lastHeapIndex-i]=temp;

            fixHeapBelow(0,lastHeapIndex-i-1);
        }
    }
    private static void fixHeapBelow(int index,int lastHeapIndex)
    {
        int childToSwap;
        while(index<=lastHeapIndex){
            int leftchild=getChild(index,true);
            int rightchild=getChild(index,false);
            if(leftchild<=lastHeapIndex){
                if(rightchild>lastHeapIndex){
                    childToSwap=leftchild;
                }
                else{
                    childToSwap=(heap[leftchild]<=heap[rightchild])?leftchild:rightchild;
                }
                //index=3,child=4
                if(heap[index]<heap[childToSwap]){
                   int temp= heap[index];//temp=3
                   heap[index]=heap[childToSwap];//index=3
                    heap[childToSwap]=temp;
                }
                else{
                    break;
                }
                index=childToSwap;
            }
            else{
                break;
            }
        }
    }
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

}
