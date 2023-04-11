package ДЗ5;
// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.Scanner;

public class Task_5_1 {
    public static void main(String[] args) {
        myTel n = new myTel();
        Scanner iScanner = new Scanner(System.in);
        Boolean ex = true;
        while (ex) {
            
        

            System.out.println("Введите то что хотите делать");
            System.out.println("Введите \"+\" для добавление в телефонную книгу");
            System.out.println("Введите \"-\" для удаления из телефонной книги ");
            System.out.println("Введите \"?\" для поиска из телефонной книги ");
            System.out.println("Введите \"P\" для выода телефонной книги ");
            System.out.println("Введите \"R\" для изменения данных ");
            System.out.println("Введите \"Ex\" для выхода из программы ");
            String action = iScanner.next();

            

            switch (action) {
                case "+":
                    n.addendum();
                    break;

                case "-":
                    n.deletTel();

                    break;

                case "?":
                    n.searchTel();

                    break;
                case "R":
                    n.changTel();

                    break;    

                case "P":
                    n.printbook();
                    break;


                case "Ex":
                    ex = false ;
            }
            
        }

        

    }

}
