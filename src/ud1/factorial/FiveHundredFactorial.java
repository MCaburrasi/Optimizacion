package ud1.factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class FiveHundredFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            BigInteger fact = BigInteger.ONE;
            for (int i = 2; i <= num; i++) {
                fact = fact.multiply(new BigInteger(Integer.toString(i)));
            }

            System.out.println(num + "!");
            System.out.println(fact);
        }
    }
}
