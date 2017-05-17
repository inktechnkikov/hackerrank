package Task7;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        for (int i = 0; i <= input; i++) {
            int a = reader.read();
            int b = reader.read();
            int c = reader.read();
            int sum = 0;
            for (int j = 0; j < c; i++) {
                sum = a;
                for (int k = 0; k <= j; k++) {
                    sum+=Math.pow(2,k) * b;
                }
                System.out.printf("%d",sum);
            }
            System.out.println();
        }
    }
}