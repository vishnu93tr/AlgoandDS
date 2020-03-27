package Stack;

import java.util.Stack;

public class InfixtoPostfix
{
    static int Prec(Character character)
    {
        switch (character)
        {
            case '+':
            case '-':
            return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;

        }
        return -1;
    }
    static String infixToPostfix(String exp)
    {
      Stack<Character> stack=new Stack<>();
      String result=new String("");
      for(int i=0;i<exp.length();i++)
      {
         Character c= exp.charAt(i);
          if(Character.isLetterOrDigit(c))
          {
              //append this to result
              result+=c;
          }
          else if(c=='(')
          {
              //push this to stack
              stack.push(c);
          }
          else if(c==')')
          {
              while (!stack.isEmpty() && stack.peek()!='(')
              {
                  result+=stack.pop();
              }
              stack.pop();
          }
          else{
              //if character is operator
              while (!stack.isEmpty() && Prec(c)<=Prec(stack.peek()))
              {
                  result+=stack.pop();
              }
              stack.push(c);
          }
      }
      while (!stack.isEmpty())
      {
          result+=stack.pop();
      }
      return result;
    }

    public static void main(String[] args)
    {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));

    }
}
