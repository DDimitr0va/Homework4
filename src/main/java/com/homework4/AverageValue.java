package com.homework4;

public class AverageValue {
    public static void main(String[] args) {
        float[] theVals = {7f, 8f, 11f, 22f};
        float sum = 0;
        for (float currentVal : theVals)
            sum += currentVal;

        System.out.println("Средната стойност на масива е " + (sum / 4));
    }
}
