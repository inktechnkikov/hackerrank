package Task4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        double n1 = Double.parseDouble(reader.readLine());
        String n2 = reader.readLine();
        System.out.printf("String: %s%n",n2);
        System.out.printf("Double: %s%n",n1);
        System.out.printf("Int: %d",n);
    }
}
