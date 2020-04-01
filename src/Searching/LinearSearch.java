package Searching;

public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] array={1,10,20,30,-15,22};
        System.out.println(LinearSearch(array,22));
        System.out.println(LinearSearch(array,12));
    }
    public static int LinearSearch(int[] input,int searchelement)
    {
        for(int i=0;i<input.length;i++)
        {
            if(input[i]==searchelement){
                return i;
            }
        }
        return -1;
    }

}
