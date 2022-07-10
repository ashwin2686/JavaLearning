package StringProgrammes;

public class DetectCapital
{


    public static void main(String[] args) {

        boolean Capital = detectBoolean("uSa");

        System.out.println("Capital :"+Capital);
    }

    private static boolean detectBoolean(String word) {

        int count=0;
        for (int i=0 ; i< word.length(); i++)

        {


            if (Character.isUpperCase(word.charAt(i)))
            {
                count++;
            }
        }

        return count == word.length() || count ==0 || count== 1 && Character.isUpperCase(word.charAt(0));


    }


}
