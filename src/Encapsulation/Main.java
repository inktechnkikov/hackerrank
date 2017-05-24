package Encapsulation;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] arr = new int[n];
        int sumOfAllNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
           int addNum = Integer.parseInt(reader.readLine());
           arr[i]+=addNum;
        }
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i : arr) {
            sumOfAllNumbers+=i;
        }
        System.out.println(sumOfAllNumbers);
    }
}
