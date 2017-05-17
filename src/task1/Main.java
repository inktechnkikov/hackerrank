package task1;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();
        LocalDate date = LocalDate.of(year,month,day);
        System.out.println(date.getDayOfWeek());
    }
}
