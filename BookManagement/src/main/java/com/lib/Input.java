package com.lib;

import java.util.Scanner;
// until
public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String inputString() {
        String output = scanner.nextLine();
        return output;
    }

    public static int inputInt() {
        do {
            try {
                int output = Integer.parseInt(scanner.nextLine());
                return output;
            } catch (NumberFormatException e) {
                System.out.println("Sai định dạng vui lòng nhập lại");
            }
        } while (true);
    }
}
