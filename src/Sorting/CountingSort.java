package Sorting;

public class CountingSort
{
    public static void main(String[] args)
    {
        int[] arr={2,5,9,8,2,8,7,10,4,3};
        CountingSort(arr,1,10);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void CountingSort(int[] input,int min,int max)
    {
       //create counting array for number of occurences
        int[] countingArray=new int[(max-min)+1];

        //traverse through input array for number of occurences
        for(int i=0;i<input.length;i++)
            countingArray[input[i]-min]++;

        int j=0;
        for(int i=min;i<=max;i++)
            while (countingArray[i-min]>0)
            {
                input[j++]=i;
                countingArray[i-min]--;
            }

    }
}
