package ud1.gcd;

import java.math.BigInteger;
import java.util.Scanner;

public class AlineacionPlanetaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int n = sc.nextInt();
            if (n == 0){
                break;
            }

            BigInteger[] p = new BigInteger[n];
            BigInteger div = BigInteger.ONE;
            BigInteger lcm = BigInteger.ONE;

            for (int i = 0; i < n; i++) {
                p[i] = sc.nextBigInteger();
                if (i == 0){
                    div = p[i];
                    lcm = div;
                }
                else if (i < n - 1){
                    lcm = (div.multiply(p[i]).divide(div.gcd(p[i])));
                    div = div.gcd(p[i]);
                }
            }

            if (lcm.equals(BigInteger.ONE)){
                for (int i = 0; i < n; i++) {
                    lcm = lcm.multiply(p[i]);
                }
            }

            BigInteger last = p[p.length - 1];
            System.out.println(lcm);
        }
    }
}
