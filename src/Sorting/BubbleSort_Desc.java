package Sorting;

public class BubbleSort_Desc
{
    public static void main(String[] args)
    {
        int[] array={20,35,-15,7,55,1,-22};
        for(int lastUnsortedIndex=array.length-1;lastUnsortedIndex>=0;lastUnsortedIndex--)
        {
            for(int i=0;i<lastUnsortedIndex;i++)
            {
                if(array[i]<array[i+1])
                {
                    swap(array,i,i+1);
                }
            }
        }
        for(int i=0;i<array.length;i++)
            System.out.println(array[i]);
    }
    public static void swap(int[] array,int i,int j)
    {
        //i=1,j=2
        int temp=array[i];//temp=1
        array[i]=array[j];//i=2
        array[j]=temp;//j=1
    }
}
