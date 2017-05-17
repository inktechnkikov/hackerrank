package Task9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int i=1;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            System.out.println(i++ +" "+sc.nextLine());
        }
    }
}
