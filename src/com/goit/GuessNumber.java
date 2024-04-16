package com.goit;

import java.util.Random;
import java.util.Scanner;

import static java.lang.String.format;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Вгадай число");
        int bound = 10;
        int generatedNumber = generateNumber(bound);
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        String userChoice = "Y";
        do {
            userNumber = getUserNumber(bound, scanner);
            if (generatedNumber == userNumber) {
                System.out.printf("Вітаю Ви вгадали число: %d\n", generatedNumber);
            } else {
                System.out.println("Нажаль Ви не вгадали число: %d, спробуйте ще раз");
            }
            System.out.println("Для виходу введіть Q/q, або Y/y для продовження");
            userChoice = scanner.next();
        } while (generatedNumber != userNumber && userChoice.equalsIgnoreCase("Y"));
        System.out.println("До зустрічі!");
        scanner.close();
    }

    public static int generateNumber(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

    public static int getUserNumber(int bound, Scanner scanner) {
        System.out.printf("введіть число від 0 до %d: %n", bound);
        int userNumber = scanner.nextInt();
        return userNumber;
    }
}
