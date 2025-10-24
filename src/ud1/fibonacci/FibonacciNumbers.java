package ud1.fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int pos = sc.nextInt();

            BigInteger[] dp = new BigInteger[pos + 1];

            for (int i = 0; i < pos + 1; i++) {
                if (i == 0)
                    dp[i] = BigInteger.ZERO;
                else if (i == 1) {
                    dp[i] = BigInteger.ONE;
                } else {
                    dp[i] = dp[i - 1].add(dp[i - 2]);
                }
            }

            System.out.println(dp[dp.length - 1]);
        }
    }
}
