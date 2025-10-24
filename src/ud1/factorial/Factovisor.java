package ud1.factorial;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Factovisor {

    public static Map<Integer, Integer> PrimeDecomposition(int n) {
        Map<Integer, Integer> map = new HashMap<>();

        while (n % 2 == 0) {
            if (!map.containsKey(2))
                map.put(2, 1);
            else
                map.replace(2, map.get(2) + 1);

            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                if (!map.containsKey(i))
                    map.put(i, 1);
                else
                    map.replace(i, map.get(i) + 1);
                n /= i;
            }
        }

        if (n > 2)
            map.put(n, 1);

        return map;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            boolean factovisor = true;
            int m = sc.nextInt();
            int n = sc.nextInt();

            if (new BigInteger(Integer.toString(n)).isProbablePrime(10) || n == 0) {
                if (n > m)
                    factovisor = false;
            } else {
                Map<Integer, Integer> primeDecomposition = PrimeDecomposition(n);
                for (Map.Entry<Integer, Integer> prime : primeDecomposition.entrySet()) {
                    String spS = new BigInteger(Integer.toString(m)).toString(prime.getKey());
                    int sp = 0;
                    for (int i = 0; i < spS.length(); i++) {
                        sp += Integer.parseInt(String.valueOf(spS.charAt(i)));
                    }

                    factovisor = (m - sp) / (prime.getKey() - 1) >= prime.getValue();

                    if (!factovisor) break;
                }
            }
            System.out.println(factovisor ? n + " divides " + m + "!" : n + " does not divide " + m + "!");
        }
    }
}