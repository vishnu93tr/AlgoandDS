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
   private static void MergeSort(int[] input,int start,int end)
   {
        //breaking condition for recursion
       if(end-start<2)
           return;

       //calculate mid
       int mid=(start+end)/2;
       MergeSort(input,start,mid);
       MergeSort(input,mid,end);

       //Merge method for merging-please note that we merge only sorted arrays
       Merge(input,start,mid,end);
   }
   private static void Merge(int[] input,int start,int mid,int end)
   {
        //optimization1
       if(input[mid-1]>=input[mid])
           return;

       //create a temparray to store sorted values
       int[] tmpArray=new int[end-start];
       //to keep a track of where we are in temporary array
       int i=start,j=mid;
       int tmpIndex=0;
       while (i<mid && j<end)
       {
           tmpArray[tmpIndex++]=input[i]>=input[j]?input[i++]:input[j++];
       }
       //copy the left over elements in left partition into temparray
       //we dont require to copy elemnts in right partition because its position is not going to change while merge

       System.arraycopy(input,i,input,start+tmpIndex,mid-i);

       //copy temporay array back to input array

       System.arraycopy(tmpArray,0,input,start,tmpIndex);


   }
}
