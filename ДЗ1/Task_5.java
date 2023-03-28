package ДЗ1;

import java.util.Scanner;

//Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
//Предложить хотя бы одно решение или сообщить, что его нет. @Liberate520

public class Task_5 {
    public static void main(String[] args) {
        System.out.println(" Привет мы проверяем выражение x? + ?y = z");

        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите десяток 1-го числа (x)");
        Integer x = iScanner.nextInt() * 10;

        System.out.println("Введите единицу 2-го  числа (y) ");
        Integer y = iScanner.nextInt();

        System.out.println("Введите сумму (sum)");
        Integer sum = iScanner.nextInt();

        for (int i = 0; i < 100; i = i + 10) {
            for (int j = 0; j < 10; j++) {
                if ((x + j) + (i + y) == sum) {
                    System.out.println("Востанавливаю   " + (x + j) + " + " + (i + y) + " = " + sum);
                    return;
                }
            }

        }
        System.out.println("Ничего не нашли (");

    }

}
