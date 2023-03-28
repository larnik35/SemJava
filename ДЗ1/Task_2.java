//Вычислить n! (произведение чисел от 1 до n)

package ДЗ1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Введите число n ");
        Scanner iScanner = new Scanner(System.in);
        Integer n = iScanner.nextInt();
        Integer comp = 1;
        for (int i = 1; i <= n; i++) {
            comp = comp * i;
        }
        System.out.println("Произведением числа от 1 до " + n + " = " + comp);

    }

}
