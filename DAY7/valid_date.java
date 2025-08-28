package DAY7;

import java.util.Scanner;

public class valid_date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();  // Expected format: dd/MM/yyyy
        String[] arr = date.split("/");

        int day = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int year = Integer.parseInt(arr[2]);

        if (year >= 1900 && year <= 9999 && month >= 1 && month <= 12) {
            int maxDay = 31;

            if (month == 2) {
                // Check leap year
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                maxDay = 30;
            }

            if (day >= 1 && day <= maxDay) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

        } else {
            System.out.println("Invalid");
        }
    }
}
