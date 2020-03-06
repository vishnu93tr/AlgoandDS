package Sorting;

public class MergeSort
{
    public static void main(String[] args)
    {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        MergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    public static void MergeSort(int[] input,int start,int end)
    {
        if(end-start<2){
            return;
        }
        int mid=(start+end)/2;
        MergeSort(input,start,mid);
        MergeSort(input,mid,end);
        Merge(input,start,mid,end);
    }

    private static void Merge(int[] input, int start, int mid, int end)
    {
        if(input[mid-1]<=input[mid]){
            return;
        }
        int i=start;
        int j=mid;
        int tempIndex=0;
        int[] tmpArray=new int[end-start];
        while (i<mid && j<end)
        {
            tmpArray[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input,i,input,start+tempIndex,mid-i);
        System.arraycopy(tmpArray,0,input,start,tempIndex);

    }
}
