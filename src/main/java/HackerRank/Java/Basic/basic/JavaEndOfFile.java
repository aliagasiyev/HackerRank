package HackerRank.Java.Basic.basic;

import java.util.Scanner;

public class JavaEndOfFile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int n = 1; scanner.hasNext(); n++) {
            String line = scanner.nextLine();
            System.out.println(n + " " + line);
        }
    }
}

