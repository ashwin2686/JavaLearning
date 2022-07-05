package StringProgrammes;

public class palindromerecursive {


    public static void main(String args[]) {


        String input = "racecar";

        System.out.println("input.charAt(input.length()-1) :  "+input.charAt(input.length()-1));
        System.out.println("input.substring(0,input.length()-1) : "+input.substring(0,input.length()-1));



        System.out.println("before");



        String reverse = reverse(input);

        System.out.println("reverse is: "+reverse);

        if(input.equals(reverse))
        {
            System.out.println("is palindrome");
        }else
        {
            System.out.println("is not palindrome");
        }

    }

    private static String reverse(String input) {

        System.out.println("input : "+input);

        String reverse = "";
        if (input == null || input.isEmpty())

        {
            return input;
        }

        System.out.println("input.charAt(input.length()-1) :  "+input.charAt(input.length()-1));
        System.out.println("input.substring(0,input.length()-1) : "+input.substring(0,input.length()-1));

        reverse = input.charAt(input.length()-1)+reverse( input.substring(0,input.length()-1));
        System.out.println("reverse in recursion: "+reverse);
        return reverse;
    }


}
