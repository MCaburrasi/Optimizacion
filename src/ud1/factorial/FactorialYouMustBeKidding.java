package ud1.factorial;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialYouMustBeKidding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            BigInteger fact = BigInteger.ONE;
            BigInteger number = new BigInteger(Integer.toString(num));
            boolean overflow = false;
            for (int i = 2; i <= num; i++) {
                fact = fact.multiply(new BigInteger(Integer.toString(i)));
                if (fact.compareTo(new BigInteger("6227020800")) > 0){
                    overflow = true;
                    break;
                }
            }


            BigInteger aux = number.abs();
            if (number.compareTo(BigInteger.ZERO) < 0 && aux.mod(new BigInteger("2")).equals(BigInteger.ONE))
                System.out.println("Overflow!");
            else if (fact.compareTo(new BigInteger("10000")) < 0)
                System.out.println("Underflow!");
            else if (overflow)
                System.out.println("Overflow!");
            else
                System.out.println(fact);
        }
    }
}
