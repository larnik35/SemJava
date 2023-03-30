package ДЗ1;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

// Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)

public class Task_4 {

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите 1-е число");
        Double a = iScanner.nextDouble();

        System.out.println("Введите 2-е число ");
        Double b = iScanner.nextDouble();

        System.out.println("Введите действие");
        String action = iScanner.next();

        Double rezult = (double) 0;

        switch (action) {
            case "+":
                rezult = a + b;
                System.out.println(" = " + rezult);
                break;

            case "-":
                rezult = a - b;
                System.out.println(" = " + rezult);
                break;

            case "*":
                rezult = a * b;
                System.out.println(" = " + rezult);
                break;

            case "/":
                rezult = a / b;
                System.out.println(" = " + rezult);
                break;

        }

    }

}
