package Numbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[100];
        for (int i = 0; i < arr.length; i++) {
            if(i * 3 == 3){
                System.out.println("Fizz");
            }
            arr[i] += String.valueOf(i);
        }
    }
}
