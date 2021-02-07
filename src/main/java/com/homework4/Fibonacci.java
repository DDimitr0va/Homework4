package com.homework4;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Въведете цяло число:");
        int n = scan.nextInt();


        if (n <= 1) {
            System.out.println(n);
        } else {
            int n0 = 0;
            int n1 = 1;
            int sum = 0;
            int sum2 = 1;

            for (int i = 2; i < n; i++) {
                sum = n0 + n1;
                n0 = n1;
                n1 = sum;
                sum2 += sum;
            }
            System.out.println("Сумата от числата на Фибоначи до " + n + " ред е: " + sum2);
        }

    }

}
