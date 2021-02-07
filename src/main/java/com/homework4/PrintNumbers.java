package com.homework4;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Въведете цяло число:");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        int j = 1;
        while (j <= n) {
            if (j % 3 == 0 || j % 7 == 0) {
                j++;
            } else {
                System.out.println("Числото " + j + " не се дели на 3 или 7 без остатък.");
                j++;
            }
        }

    }
}