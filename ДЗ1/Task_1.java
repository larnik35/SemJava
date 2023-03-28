// Вычислить n-ое треугольного число (сумма чисел от 1 до n)
package ДЗ1;

import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        System.out.println("Введите нужное число ");

        Scanner iScanner = new Scanner(System.in);
        int n = iScanner.nextInt();
        System.out.println("Введеное число = " + n);
        int t = n * (n + 1) / 2;
        System.out.println("Триугольное число числа " + n + " = " + t);
    }

}