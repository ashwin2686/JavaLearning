package Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CoinChangeProblem {



    public  static  int coinsChange(int coins[],int amount)
    {

        int dp[] = new int[amount+1];

        Arrays.fill(dp,amount+1);

        System.out.println("Array values" + Arrays.stream(dp).boxed().collect(Collectors.toList()) );

        dp[0]=0;

        for (int i=0 ; i <= amount;i++)
        {
            for(int j=0 ; j< coins.length;j++)
                if(coins[j]<= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            else
                {
                    break;
                }
        }

        System.out.println("Array values after" + Arrays.stream(dp).boxed().collect(Collectors.toList()) );

        return dp[amount] > amount ? -1 : dp[amount];

    }

    public static void main(String[] args) {
        int coins[] = {1,2,5};
        int amount = 9;

        int value = coinsChange( coins,amount);
        System.out.println("Minimum coins needed :" +value);

    }



}



