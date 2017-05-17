package Task8;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                    continue;
                }
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                    continue;
                }
                if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("* int");
                    System.out.println("* long");
                    continue;
                }
                if (x > 2147483647 || x < -2147483648) {
                    System.out.println("* long");
                    continue;
                }

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}