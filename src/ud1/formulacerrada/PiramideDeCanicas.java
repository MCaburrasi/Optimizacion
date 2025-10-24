package ud1.formulacerrada;

import java.util.Scanner;

public class PiramideDeCanicas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();
        for (int i = 0; i < iterations; i++) {
            long height = sc.nextLong();
            long marbels = (height * (height + 1) * (height + 2)) / 6;
            System.out.println(marbels);
        }
        sc.close();
    }
}
