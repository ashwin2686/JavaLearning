package Stack;

import java.util.Stack;

public class BackSpacecompare {


    public static boolean backspacecompareString ( String S , String T)
    {
        Stack<Character> sStack = new Stack<>();

        for ( char c : S.toCharArray())
        {
            if( c!= '#') {

                sStack.push(c);
            }
            else if (!sStack.isEmpty())
            {
                sStack.pop();
            }
        }

        Stack<Character> tStack = new Stack<>();

        for ( char c : T.toCharArray())
        {
            if( c!= '#') {

                tStack.push(c);
            }
            else if (!tStack.isEmpty())
            {
                tStack.pop();
            }
        }

        while (!sStack.isEmpty())
        {

            char current  = sStack.pop();

            if (tStack.isEmpty() || current!=tStack.pop() )
            {
                return false;
            }

        }


        return sStack.isEmpty()&& tStack.isEmpty();


    }


    public static void main(String[] args) {

        String S = "a#c";
        String T = "a#c";


        System.out.println(backspacecompareString (  S ,  T));


    }


}
