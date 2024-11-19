package HackerRank.Java.Basic.basic;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    static int breadth;
    static int height;
    static boolean block = true;

    static {
        Scanner scanner = new Scanner(System.in);
        breadth = scanner.nextInt();
        height = scanner.nextInt();

        if (breadth <= 0 || height <= 0) {
            block = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {
        if (block) {
            int result = breadth * height;
            System.out.println(result);
        }
    }
}
