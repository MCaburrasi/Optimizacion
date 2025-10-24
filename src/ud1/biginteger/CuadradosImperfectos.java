package ud1.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class CuadradosImperfectos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String number = sc.nextLine();
            BigInteger bigInteger = new BigInteger(number, 10);
            String lastNumber = bigInteger.toString(16);
            char lastChar = lastNumber.charAt(lastNumber.length()-1);
            if (lastChar == '0' || lastChar == '1' || lastChar == '4' || lastChar == '9')
                System.out.println("NO SE");
            else
                System.out.println("IMPERFECTO");
        }
        sc.close();
    }
}