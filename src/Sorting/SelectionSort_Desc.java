package Sorting;

public class SelectionSort_Desc
{
    public static void main(String[] args)
    {
        int[] array={20,35,-15,7,55,1,-22};
        for(int lastunsortedIndex=array.length-1;lastunsortedIndex>=0;lastunsortedIndex--)
        {
            int smallest=0;
            for(int i=1;i<=lastunsortedIndex;i++)
            {
                if(array[i]<array[smallest])
                {
                    smallest=i;
                }
            }
            swap(array,smallest,lastunsortedIndex);
        }
        for(int ref:array)
            System.out.println(ref);
    }
    public static void swap(int[] input,int i,int j)
    {
        //i=1,j=2
        int temp=input[j];//temp=2
        input[j]=input[i];//j=1
        input[i]=temp;//i=2

    }
}
