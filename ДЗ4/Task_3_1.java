package ДЗ4;



import java.util.Collections;
import java.util.LinkedList;

import java.util.ListIterator;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернёет «перевёрнутый» список.

public class Task_3_1 {
    public static void main(String[] args) {

        String str1 = "Пробушка ";
        String str2 = "Бабушка ";
        String str3 = "Мама ";
        String str4 = "Дочка ";

        LinkedList<String> array = new LinkedList<>();
        array.add(str1);
        array.add(str2);
        array.add(str3);
        array.add(str4);

        System.out.println(array);

        
        LinkedList<String> revirsArray = reversLst(array);
        System.out.println("Вариант 1:");
        System.out.println(revirsArray);

        reversLst_2(array);

    }

    static LinkedList<String> reversLst(LinkedList<String> array) {
        
        Collections.reverse(array);
        return array;
       
        
        
    }
    static void reversLst_2(LinkedList<String> array){
    LinkedList<String> revirsArray2 = new LinkedList<>();
    ListIterator<String> listIterator = array.listIterator((array.size()));
            while (listIterator.hasPrevious()) {
                String n = listIterator.previous();
                revirsArray2.add(0, n);
                               
            }
            System.out.println("Вариант 2: ");
            System.out.println(revirsArray2);


    }


}
