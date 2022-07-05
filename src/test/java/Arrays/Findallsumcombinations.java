package Arrays;




import java.util.Arrays;
import java.util.stream.Collectors;

class Findallsumcombinations
{
    // Recursive function to print all combinations of numbers from `i` to `n`
    // having sum `n`. The `index` denotes the next free slot in the output array `out`
    public static void printCombinations(int i, int n, int[] out, int index)
    {
        // if the sum becomes `n`, print the combination
        if (n == 0)
        {
            System.out.println(Arrays.stream(out).limit(index)
                    .boxed().collect(Collectors.toList()));
        }

        // start from the previous element in the combination till `n`
        for (int j = i; j <= n; j++)
        {
            // place current element at the current index

            System.out.println("index in loop:  "+index);
            System.out.println("j:  "+j);

            out[index] = j;
            System.out.println("inside array "+Arrays.stream(out)
                    .boxed().collect(Collectors.toList()));

            // recur with a reduced sum

            System.out.println("n-j:  "+(n-j));
            System.out.println("index+1:  "+(index+1));
            printCombinations(j, n - j, out, index + 1);
        }
    }

    public static void main(String[] args)
    {
        int n = 2;
        int[] out = new int[n];

        // print all combinations of numbers from 1 to `n` having sum `n`
        printCombinations(1, n, out, 0);
    }
}