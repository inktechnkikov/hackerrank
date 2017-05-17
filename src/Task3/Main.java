package Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String ans;
        if(n%2 == 1){
            ans = "Weird";
        }else if(n >= 2 && n <=5){
            ans = "Not Weird";
        }else if(n >= 5 && n <= 20){
            ans = "Weird";
        }else{
            ans = "Not Weird";
        }
        System.out.println(ans);
    }
}
