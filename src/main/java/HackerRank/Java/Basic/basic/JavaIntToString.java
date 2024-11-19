package HackerRank.Java.Basic.basic;

import java.util.Scanner;

public class JavaIntToString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= -100 && a <= 100) {
            System.out.println("Good job");
        }
    }
}
