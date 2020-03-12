package Sorting;

public class MergeSort_Desc
{
    public static void main(String[] args)
    {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
        MergeSort(intArray,0,intArray.length);
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
    public static void MergeSort(int[] input,int start,int end)
    {
        //breaking condition for recursion
        if(end-start<2)
            return;

        int mid=(start+end)/2;
        //For left array
        MergeSort(input,start,mid);
        //For right array
        MergeSort(input,mid,end);
        Merge(input,start,mid,end);
    }
    public static void Merge(int[] input,int start,int mid,int end)
    {
        //optimization1
        if(input[mid-1]>=input[mid])
            return;

        //create a temporary array for merging
        //we sort values while merging

        int[] tmpArray=new int[end-start];

        int tmpIndex=0;
        int i=start;
        int j=mid;

        //Merging or sorting

        while(i<mid && j<end)
        {
            tmpArray[tmpIndex++]=input[i]>=input[j]?input[i++]:input[j++];
        }
        //shift input array to start+tmpIndexitems

        System.arraycopy(input,start,input,start+tmpIndex,mid-i);

        //copy tmp array back to input array

        System.arraycopy(tmpArray,0,input,start,tmpIndex);
    }
}
