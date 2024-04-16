package com.goit;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int a = 3;
        int b = 4;
        int sumResult = 0;
        System.out.println("start");
        // перевірка умови спочатку, потім виконання коду
        while (num1 > sumResult) {
            b++;
            sumResult = add(a, b);
            System.out.println("sumResult:" + sumResult);
            System.out.println("num1:" + num1);
            System.out.println("b:" + b);

        }
        // виконання коду, потім перевірка умови в кінці
        int c = 10;
        do {
            b++;
            sumResult = add(a, c);
            System.out.println("sumResult:" + sumResult);
            System.out.println("num1:" + num1);
            System.out.println("b:" + b);
        } while (num1 > c);

        int[] array = {1, 4, 5, 7, 8, 9, 24};
        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            System.out.println("currentNumber: " + currentNumber);
        }

        for (int i = 0, k=1; i < array.length; i++, k--) {
            int currentNumber = array[i];
            System.out.println("currentNumber: " + currentNumber);
        }

        for (int currentNumber : array) {
            System.out.println("currentNumber: " + currentNumber);
        }

        System.out.println("end");
    }

    public static int add(int a, int b) {
        return a + b;
    }
}