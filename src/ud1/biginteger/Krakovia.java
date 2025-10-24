package ud1.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class Krakovia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int items;
        int people;
        int bill = 1;

        while (true){
            items = sc.nextInt();
            people = sc.nextInt();
            if (items == 0 && people == 0)
                break;
            BigInteger carry = BigInteger.ZERO;

            for (int i = 0; i < items; i++) {
                BigInteger bi = new BigInteger(sc.next());
                carry = carry.add(bi);
            }

            BigInteger average = carry.divide(BigInteger.valueOf(people));

            System.out.println("Bill #" + bill++ + " costs " + carry + ": each friend should pay " + average);
            System.out.println();
        }
    }
}
