package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class PalindromeStackQueue
{
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Don't nod"));
    }
    //push,pop
    //addLast,removeFirst
    //hello

    //olleh

    public static boolean checkForPalindrome(String string)
    {
        Deque<Character> characterDeque=new ArrayDeque<>();
        Stack<Character> characterStack=new Stack<>();
        string=string.toLowerCase();
        for(int i=0;i<string.length();i++)
        {
            Character c=string.charAt(i);
            if(c>=97 && c<=122)
            {
                characterDeque.addLast(c);
                characterStack.push(c);
            }
        }
       return characterDeque.peek().toString().equals(characterStack.peek().toString());

    }
}
