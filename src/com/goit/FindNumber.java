package com.goit;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 22, 67, 23, 56, 34, 33, 67, 26};
        printArray(numbers);
        String userChoice = "Y";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введіть число для пошуку: ");
            int userNumber = scanner.nextInt();
            Integer number = findNumber(userNumber, numbers);
            if (number != null) {
                System.out.printf("пошук завершено успішно, число:%d\n", number);
            } else {
                System.out.printf("Нажаль Ви не знайшли число: %d, спробуйте ще раз\n", userNumber);
            }
            System.out.println("Для виходу введіть Q/q, або Y/y для продовження");
            userChoice = scanner.next();
        } while (userChoice.equalsIgnoreCase("Y"));
        System.out.println("До зустрічі!");
        scanner.close();
    }

    public static Integer findNumber(int userNumber, int[] numbers) {
        for (int number : numbers) {
            if (number == userNumber) {
                return number;
            }
        }
        return null;
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void printArrayV2(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}
