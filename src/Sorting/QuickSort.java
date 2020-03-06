package Sorting;

public class QuickSort
{
    public static void main(String[] args)
    {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        QuickSort(intArray,0,intArray.length);
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    public static void QuickSort(int[] array,int start,int end)
    {
        if(end-start<2){
            return;
        }
        int pivotIndex=partition(array,start,end);
        QuickSort(array,start,pivotIndex);
        QuickSort(array,pivotIndex+1,end);
    }

    private static int partition(int[] array, int start, int end)
    {
        int pivot=array[start];
        int i=start;
        int j=end;
        while (i<j)
        {
            while (i<j && array[--j]>=pivot);
            if(i<j){
                array[i]=array[j];
            }

            while (i<j && array[++i]<=pivot);
            if(i<j){
                array[j]=array[i];
            }
        }
        array[j]=pivot;
        return j;
    }
}
