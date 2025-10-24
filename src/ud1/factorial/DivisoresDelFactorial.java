package ud1.factorial;

import java.util.Scanner;

public class DivisoresDelFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        int n;

        while (true){
            p = sc.nextInt();
            n = sc.nextInt();

            if (p < 0 && n < 0){
                break;
            }

            if (n >= p)
                System.out.println("YES");
            else if (p <= 1 && n == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
