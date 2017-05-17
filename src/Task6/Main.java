package Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            builder.append(n).append(" x ").append(i).append(" = ").append(n * i).append(System.lineSeparator());
        }
        System.out.println(builder);
    }
}
