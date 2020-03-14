package Sorting;

public class RadixSort
{
    public static void main(String[] args)
    {
        int[] radixArray={4725,4586,1330,8792,1594,5729};
        radixsort(radixArray,4,10);
        for(int i=0;i<radixArray.length;i++)
        {
            System.out.println(radixArray[i]);
        }
    }
    public static void radixsort(int[] input,int width,int radix)
    {
        for(int i=0;i<width;i++)
        {
            radixsinglesort(input,i,radix);
        }
    }

    private static void radixsinglesort(int[] input, int position, int radix)
    {
        //get counts of elements
        int numIndex=input.length;
        int[] countArray=new int[radix];
        for(int value:input)
        {
            countArray[getDigit(position,value,radix)]++;
        }
        //calculate adjusted counts
        for(int i=1;i<radix;i++)
        {
            countArray[i]+=countArray[i-1];
        }
        int[] tmpArray=new int[numIndex];
        for(int tempIndex=numIndex-1;tempIndex>=0;tempIndex--)
        {
            tmpArray[--countArray[getDigit(position,input[tempIndex],radix)]]=input[tempIndex];
        }
        //copy temp index back into normal input array
        for(int i=0;i<numIndex;i++)
        {
            input[i]=tmpArray[i];
        }
    }
    private static int getDigit(int position, int value, int radix)
    {
        return value/(int)Math.pow(radix,position)%radix;
    }
}
