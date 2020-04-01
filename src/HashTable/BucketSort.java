package HashTable;

import java.util.*;

public class BucketSort
{
    public static void main(String[] args)
    {
        int[] array={54,46,83,66,95,92,43,};
        bucketSort(array);
        for(int ref:array){
            System.out.println(ref);
        }
    }
    public static void bucketSort(int[] input)
    {
        //create bucket list integer array
        List<Integer>[] buckets=new List[10];

        //create individual bucket
        for(int i=0;i<buckets.length;i++)
        {
            buckets[i]=new LinkedList<>();
        }

        //scatter values into buckets by traversing through input array
        for(int i=0;i<input.length;i++)
        {
            buckets[hash(input[i])].add(input[i]);
        }
        //sort values in buckets
        for(List<Integer> bucket:buckets)
        {
            Collections.sort(bucket);
        }

        //copy values back to input array
        int j=0;
        for(int i=0;i<buckets.length;i++)
        {
            for(int values:buckets[i]){
                input[j++]=values;
            }
        }
    }
    private static int hash(int value){
        return value/(int)10;
    }
}
