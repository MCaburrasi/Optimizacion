package ud1.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class AutomorphicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String stringNum = sc.next();
            BigInteger num = new BigInteger(stringNum);
            if (num.pow(2).toString().endsWith(num.toString()) && !num.equals(BigInteger.ONE) && !num.equals(BigInteger.ZERO)){
                System.out.println("Automorphic number of " + stringNum.length() + "-digit.");
            } else {
                System.out.println("Not an Automorphic number.");
            }
        }
    }
}