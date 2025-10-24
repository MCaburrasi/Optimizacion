package ud1.gcd;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pi {
    public static List<BigInteger[]> PairCrafter(BigInteger[] nums){
        List<BigInteger[]> pairs = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                pairs.add(new BigInteger[]{nums[i], nums[j]});
            }
        }

        return pairs;
    }

    public static int CoPrimeGetter (List<BigInteger[]> pairs){
        List<BigInteger[]> coPrimes = new ArrayList<>();

        for (BigInteger[] pair : pairs){
            if (pair[0].gcd(pair[1]).equals(BigInteger.ONE))
                coPrimes.add(pair);
        }

        return coPrimes.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int n = sc.nextInt();
            if (n == 0)
                break;

            BigInteger[] nums = new BigInteger[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextBigInteger();
            }

            try{
                List<BigInteger[]> pairs = PairCrafter(nums);
                int pairAmount = pairs.size();
                int coPrimeAmount = CoPrimeGetter(pairs);
                BigDecimal sol = new BigDecimal(Math.sqrt((double) (6 * pairAmount) / coPrimeAmount));

                System.out.println(sol.setScale(6, RoundingMode.HALF_UP));
            } catch (NumberFormatException e){
                System.out.println("No estimate for this data set.");
            }


        }
    }
}
