import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

// Реализовать простой калькулятор (введите первое число, введите второе число, введите требуемую операцию, ответ)

public class Task_4 {

    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);

        System.out.println("Введите 1-е число");
        Integer a = iScanner.nextInt();

        System.out.println("Введите 2-е число ");
        Integer b = iScanner.nextInt();

        System.out.println("Введите действие");
        String action = iScanner.next();

        Integer rezult = 0;

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
