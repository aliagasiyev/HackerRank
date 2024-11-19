package HackerRank.Java.Basic.basic;

import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            int result = a;

            for (int j = 0; j < n; j++) {
                result += (int) (Math.pow(2, j) * b);
                System.out.print(result + " ");
            }
            System.out.println();
        }

        scanner.close();
    }


}

