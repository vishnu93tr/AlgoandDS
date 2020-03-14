package Sorting;

public class InsertionSort_Recursion
{
    public static void main(String[] args)
    {
        int[] array={20,35,-15,7,55,1,-22};
        Insertion(array,array.length);
        for(int ref:array)
            System.out.println(ref);
    }
    public static void Insertion(int[] input,int numItems)
    {
        if(numItems<2)
            return;

        Insertion(input,numItems-1);
        int newElement=input[numItems-1];
        int i;
        for(i=numItems-1;i>0&&input[i-1]>newElement;i--)
        {
            input[i]=input[i-1];
        }
        input[i]=newElement;
    }
}
