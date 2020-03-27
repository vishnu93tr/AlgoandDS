package Stack;

import java.util.LinkedList;


public class PalindromeStack
{

    public static boolean checkForPalindrome(String string)
    {
        LinkedList<Character> stack=new LinkedList<>();
        string=string.toLowerCase();
        StringBuilder stringBuilder=new StringBuilder(string.length());
       for(int i=0;i<string.length();i++)
       {
           if(string.charAt(i)>=97 && string.charAt((i))<=122)
           {
                stringBuilder.append(string.charAt(i));
                stack.push(string.charAt(i));
           }

       }
        StringBuilder reverse=new StringBuilder(stack.size());
        while (!stack.isEmpty())
        {
            reverse.append(stack.pop());
        }
        return stringBuilder.toString().equals(reverse.toString());
    }

    public static void main(String[] args)
    {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));


    }


}
