package com.homework4;

public class SumOddEven {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 8, 9, 4, 3};
        int odd = 0;
        int even = 0;

        for (int j : array) {
            if (j % 2 == 0)
                even += j;

            else
                odd += j;
        }
        System.out.println("Сумата от всички четни числа е " + even);
        System.out.println("Сумата от всички нечетни числа е " + odd);
    }

}

