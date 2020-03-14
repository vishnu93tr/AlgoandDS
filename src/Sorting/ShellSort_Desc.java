package Sorting;

public class ShellSort_Desc
{
    public static void main(String[] args)
    {
        int[] array={20,35,-15,7,55,1,-22};
       //calculate gap value
        for(int gap=array.length/2;gap>0;gap/=2)
        {
            for(int i=gap;i<array.length;i++)
            {
                int newElement=array[i];
                int j=i;
                while (j>=gap && array[j-gap]<newElement)
                {
                    array[j]=array[j-gap];
                    j-=gap;
                }
                array[j]=newElement;
            }

        }
        for(int ref:array)
            System.out.println(ref);
    }
}
