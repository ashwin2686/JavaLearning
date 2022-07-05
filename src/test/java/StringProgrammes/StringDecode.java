package StringProgrammes;

import java.util.Stack;

public class StringDecode

{



    public static void main(String[] args) {
        String input =  "3[ax]2[by]4[cz]";
        System.out.println("input : " + input);

        String output = decodeString(input);

        System.out.println("output : " + output);


    }
    public static String decodeString(String s)
    {
      String result = "";
        String output = "";
        Stack<Integer> counts = new Stack<>();
        Stack<String> values = new Stack<>();
       int index = 0;
        StringBuilder sb = new StringBuilder();

       while (index < s.length())
       {

           if(Character.isDigit(s.charAt(index)))
           {
               int count =0;

               while(Character.isDigit(s.charAt(index)))
               {
                   count = count*10 + (s.charAt(index) -'0');
                   index++;

               }

               counts.push(count);
           }


           if (s.charAt(index)== '[')
           {
               index++;
           }

           if (Character.isAlphabetic(s.charAt(index)))
           {


               result += s.charAt(index);


               index++;
           }

           if (s.charAt(index)== ']')
           {


               values.push(result);
               int count = counts.pop();


               String t= values.pop();
               System.out.println("t : " + t);
               System.out.println("count : " + count);


               for ( int i= 0 ; i<count ;i++)
               {
                  // System.out.println("i : " + i);

                  sb= sb.append(t);

               }
               System.out.println(" sb: " + sb);

               output =sb.toString();
                t= "";
               result = "";
               //System.out.println("t after : " + t);
               //System.out.println("result after : " + result);


               index++;
           }

       }






        return output;
    }



}
