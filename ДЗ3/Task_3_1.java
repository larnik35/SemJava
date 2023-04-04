
// Пусть дан произвольный список целых чисел, удалить из него четные числа

package ДЗ3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Task_3_1 {

    public static void main(String[] args) {
        System.out.println("введите длинну массива ");
        Scanner iScanner = new Scanner(System.in);
        int size = iScanner.nextInt();

        List<Integer> n = creatList(size);
        deletNambers(n);

    }

    static List<Integer> creatList(Integer size) {
        List<Integer> nambers = new ArrayList<>();
        for (int index = 0; index < size; index++) {
            int n = (int) (Math.random() * 10);
            nambers.add(n);

        }
        System.out.println("Сформированный массив " + nambers);
        return nambers;
    }

    static void deletNambers(List<Integer> n) {

        java.util.Iterator<Integer> listIterator = n.iterator();
        while (listIterator.hasNext()) {
            Integer nextNamber = listIterator.next();
            Integer w = nextNamber % 2;

            if (w == 0) {
                listIterator.remove();
            }
        }

        System.out.println("Массив без четных чисел " + n);

    }

}
