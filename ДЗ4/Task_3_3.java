package ДЗ4;

import java.util.Iterator;
import java.util.LinkedList;




// Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор
public class Task_3_3 {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(17);
        list.add(22);
        list.add(123);
        list.add(10);
        System.out.println(list);
        sumList(list);
        
    }
    static void sumList(LinkedList<Integer> list){
        Integer sum = 0;
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer nextNaber = iterator.next();
            sum +=nextNaber;
            //System.out.println(nextNaber);
        }
        System.out.println("Сумма чисел в списке = " + sum);
    }
}
