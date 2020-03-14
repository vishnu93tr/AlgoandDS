package Sorting;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] array={20,35,-15,7,55,1,-22};
        //selection sort code
        for(int lastunsortedIndex=array.length-1;lastunsortedIndex>0;lastunsortedIndex--)
        {
            int largest=0;
            for(int i=1;i<=lastunsortedIndex;i++)
            {
                if(array[i]>array[largest])
                {
                    largest=i;
                }
            }
            swap(array,largest,lastunsortedIndex);
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    public static  void swap(int[] arr,int i,int j)
    {
        if(i==j){
            return;
        }
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
