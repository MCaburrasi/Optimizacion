package ud1.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class PruebaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n1 = new BigInteger(sc.next());
        BigInteger n2 = new BigInteger(sc.next());

        //Suma, Resta y Producto
        System.out.println("Suma: " + n1.add(n2));
        System.out.println("Resta: " + n1.subtract(n2));
        System.out.println("Producto: " + n1.multiply(n2));

        //Diferencia absoluta
        System.out.println("Diferencia absoluta: " + n1.subtract(n2).abs());

        //Potencia y Modulo
        System.out.println("Potencia y modulo: " + n1.modPow(new BigInteger("1000000007"), n2));

        //Maximo y Minimo
        System.out.println("Maximo: " + n1.max(n2));
        System.out.println("Minimo: " + n1.min(n2));

        //Cambio Base
        System.out.println("\nA que base quieres convertir los numero");
        int radix = sc.nextInt();
        System.out.println(n1 + " en base " + radix + " = " + n1.toString(radix));
        System.out.println(n2 + " en base " + radix + " = " + n2.toString(radix));

    }
}
