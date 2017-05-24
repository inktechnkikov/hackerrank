package DeleteOdd;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            int addNumber = Integer.parseInt(reader.readLine());
            arr[i] = addNumber;
        }
        for (int i : arr) {
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
