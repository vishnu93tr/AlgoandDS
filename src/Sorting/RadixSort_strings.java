package Sorting;

public class RadixSort_strings
{
    public static void main(String[] args)
    {
        String[] stringsArray = { "bcdef", "dbaqc", "abcde", "omadd", "bbbbb"};
        radixsort(stringsArray,5,26);
        for(String ref:stringsArray)
            System.out.println(ref);
    }
    public static void radixsort(String[] input,int width,int radix)
    {
        //traverse through input array
        for(int i=width-1;i>=0;i--)
        {
            radixSingleSort(input,i,radix);
        }
    }

    private static void radixSingleSort(String[] input, int position, int radix)
    {
        //get numCount
        int numCount=input.length;

        //get raw counts in a counting array
        int[] countArray=new int[radix];
        for(String value:input)
        {
            countArray[getLetter(value,position)]++;
        }
        //get adjusted counts
        for(int i=1;i<countArray.length;i++)
        {
            countArray[i]+=countArray[i-1];
        }
        //create a temp array to sort values
        String[] tmpArray=new String[numCount];

        //radix sort main logic

        for(int k = numCount-1; k>=0; k--)
        {
            tmpArray[--countArray[getLetter(input[k],position)]]=input[k];
        }
        //copy temporary array back to input array
        for(int i=0;i<numCount;i++)
        {
            input[i]=tmpArray[i];
        }
    }

    private static int getLetter(String value,int position)
    {
        return value.charAt(position)-'a';
    }
}
