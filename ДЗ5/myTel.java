package ДЗ5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class myTel {
    Map<String, List<String>> telefMap = new HashMap<>();


    void addendum(){
        List<String> tel = new LinkedList<>();
        Scanner iAddScanner = new Scanner(System.in);        
        System.out.println("Введите Имя и фамилию");
        String name = iAddScanner.nextLine();
        System.out.println("Введите номер телефона ");
        String t = iAddScanner.nextLine();
        tel.add(t);
        telefMap.put(name, tel);
        System.out.println(telefMap + "\n");
    }

    void printbook(){

        for(Map.Entry<String, List<String>> item : telefMap.entrySet()){
         
            System.out.printf("Имя Фамилия: %s  тел.: %s \n", item.getKey(), item.getValue());
        }
    }

    void searchTel(){

        Scanner iAddScanner = new Scanner(System.in);        
        System.out.println("Введите Имя и фамилию через пробел");
        String name = iAddScanner.nextLine();
        List<String> tel = telefMap.get(name);
       System.out.println("тел. " + tel);


    }

    void deletTel(){
        Scanner iAddScanner = new Scanner(System.in);        
        System.out.println("Введите Имя и фамилию через пробел для удаление из тел. книги");
        String name = iAddScanner.nextLine();
        telefMap.remove(name);

    }

    void changTel(){

        Scanner iAddScanner = new Scanner(System.in);        
        System.out.println("Введите Имя и фамилию через пробел");
        String name = iAddScanner.nextLine();
        System.out.println("Если Вы хотите полностью изменить данные нажмите \"R \"");
        System.out.println("Если дополнить \" W\"");

        String action = iAddScanner.nextLine();
        switch (action) {
            case "R":
                List<String> tel_2 = new LinkedList<>();
                System.out.println("Введите новый номер телефона ");
                String t_2 = iAddScanner.nextLine();
                tel_2.add(t_2);
                telefMap.replace(name, tel_2);
                break;

            case "W":
                System.out.println("Введите  номер телефона который хотите дозаписать ");
                String t = iAddScanner.nextLine();
                List<String> tel = telefMap.get(name);
                tel.add(t);
                telefMap.put(name, tel);
                

                break;
        }          
    }
                

    
}
