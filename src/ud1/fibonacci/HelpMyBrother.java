package ud1.fibonacci;

import java.math.BigInteger;
import java.util.Scanner;

public class HelpMyBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true){
            count++;
            int pos = sc.nextInt();

            if (pos == 0)
                break;

            BigInteger[] dp = new BigInteger[pos + 1];
            BigInteger[] dpSum = new BigInteger[pos + 1];

            for (int i = 0; i < pos + 1; i++) {
                if (i == 0){
                    dp[i] = BigInteger.ZERO;
                    dpSum[i] = BigInteger.ZERO;
                }
                else if (i == 1) {
                    dp[i] = BigInteger.ONE;
                    dpSum[i] = BigInteger.ONE;
                } else {
                    dp[i] = dp[i - 1].add(dp[i - 2]);
                    dpSum[i] = dpSum[i - 1].add(dp[i]);
                }
            }

            BigInteger bi = new BigInteger(dp[pos].toString());
            BigInteger medianD = dp[pos].mod(new BigInteger("2")).equals(BigInteger.ZERO) ? bi.subtract(BigInteger.ONE).divide(new BigInteger("2")) : bi.divide(new BigInteger("2"));

            System.out.println("Set " + count + ":");
            System.out.println(dpSum[dp.length - 2].add(medianD));
        }
    }
}
