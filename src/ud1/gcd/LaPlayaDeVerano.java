package ud1.gcd;

import java.math.BigInteger;
import java.util.Scanner;

public class LaPlayaDeVerano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            BigInteger num;
            BigInteger last = BigInteger.ONE;
            boolean first = true;
            BigInteger sum = BigInteger.ZERO;
            while (!(num = sc.nextBigInteger()).equals(BigInteger.ZERO)){
                sum = sum.add(num);
                if (!first) {
                    last = last.gcd(num);
                } else {
                    first = false;
                    last = num;
                }
            }

            if (sum.equals(BigInteger.ZERO)){
                break;
            }

            System.out.println(sum.divide(last));
        }
    }
}
