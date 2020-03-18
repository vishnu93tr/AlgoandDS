package Sorting;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] array={20,35,-15,7,55,1,-22};
        for(int lastunsortedindex=array.length-1;lastunsortedindex>0;lastunsortedindex--)
        {
            for(int i=0;i<lastunsortedindex;i++){
                if(array[i]>array[i+1]){
                    swap(array,i,i+1);
                }
            }
        }
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    public static  void swap(int[] arr,int i,int j)
    {
        if(i==j)
        {
            return;
        }
        int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
