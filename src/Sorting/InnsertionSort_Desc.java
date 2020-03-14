package Sorting;

public class InnsertionSort_Desc
{
    public static void main(String[] args)
    {
        int[] array={20,35,-15,7,55,1,-22};
        for(int firstunsortedIndex=1;firstunsortedIndex<array.length;firstunsortedIndex++)
        {
            int element_to_insert=array[firstunsortedIndex];
            int i;
            for(i=firstunsortedIndex;i>0&&array[i-1]<element_to_insert;i--)
            {
                array[i]=array[i-1];
            }
            array[i]=element_to_insert;
        }
        for(int ref:array)
            System.out.println(ref);
    }
}
