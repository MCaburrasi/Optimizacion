package ud1.modularalgebra;

import java.math.BigInteger;
import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        /**
         * Calcular 2^1000 mod 13
         */
        BigInteger b1 = new BigInteger("2").modPow(new BigInteger("1000"), new BigInteger("13"));
        System.out.println(b1);

        /**
         * Encontrar el último dígito de 7^222
         */
        BigInteger b2 = new BigInteger("7").modPow(new BigInteger("222"), new BigInteger("10"));
        System.out.println(b2);

        /**
         *  UNOS
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ones = "1";
        boolean found = false;

        while (!found){
            ones = ones + "1";
            found = new BigInteger(ones).mod(new BigInteger(Integer.toString(n))).equals(BigInteger.ZERO);
        }

        System.out.println(ones.length());
        /**
         * Calcular (123456789987654321) mod 1000000007
         */
        BigInteger b4 = new BigInteger("123456789").modPow(new BigInteger("97654321"), new BigInteger("1000000007"));
        System.out.println(b4);
    }

}
