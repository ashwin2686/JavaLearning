package StringProgrammes;

public class stringrotation {


    public static void main(String... args) {

        String a = "indiausa";
        String b = "usaindia";

        String c = a+a;

        if (c.indexOf(b) != -1) {

            System.out.println("yes");

        }
        else
        {
            System.out.println("no");
        }


    }
}
