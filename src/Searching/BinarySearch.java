package Searching;

public class BinarySearch
{

    public static void main(String[] args)
    {
        int[] array={-22,15,17,24,25,27,45};
        System.out.println(BinarySearchIterative(array,45));
        System.out.println(BinarySearchRecursive(array,45));
    }
    public static int BinarySearchIterative(int[] input,int value)
    {
        int start=0;
        int end=input.length;
        while (start<end)
        {
            int mid=(start+end)/2;
            if(input[mid]==value){
                return mid;
            }
            else if(input[mid]<value){
                //value must be in right partition
                start=mid+1;
            }
            else {
                //value must be in left partition
                end=mid;
            }
        }
        return -1;
    }
    public static int BinarySearchRecursive(int[] input,int value)
    {
        return binarysearch(input,value,0,input.length);
    }
    public static int binarysearch(int[] input,int value,int start,int end)
    {
        //breaking condition
        if(start==end){
            return -1;
        }
        int mid=(start+end)/2;
        if(input[mid]==value){
            return mid;
        }
        else if(input[mid]<value){
            return binarysearch(input,value,mid+1,end);
        }
        else{
           return binarysearch(input,value,0,mid);
        }
    }

}
