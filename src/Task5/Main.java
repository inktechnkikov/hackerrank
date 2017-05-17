package Task5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
          String[] input = reader.readLine().split("\\s+");
          String s = String.valueOf(input[0]);
          int n = Integer.parseInt(input[1]);
            builder.append(String.format("%-15s%03d",s,n)).append(System.lineSeparator());
        }
        System.out.println("================================");
        System.out.print(builder);
        System.out.println("================================");
    }
}
