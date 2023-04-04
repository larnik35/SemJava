//Задан целочисленный список ArrayList. Найти минимальное,
//максимальное и среднее арифметическое из этого списка. Collections.max()

package ДЗ3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_3_2 {
    public static void main(String[] args) {
        System.out.println("введите длинну массива ");
        Scanner iScanner = new Scanner(System.in);
        int size = iScanner.nextInt();

        List<Integer> n = creatList(size);
        minNamber(n);
        maxNamber(n);
        mediumNamber(n, size);
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

    static void minNamber(List<Integer> n) {
        Integer min = n.get(0);
        java.util.Iterator<Integer> listIterator = n.iterator();

        while (listIterator.hasNext()) {
            Integer nextNamber = listIterator.next();
            Integer w = nextNamber.compareTo(min);
            if (w == -1) {
                min = nextNamber;
            }
        }

        System.out.println("Минимальное число = " + min);

    }

    static void maxNamber(List<Integer> n) {
        Integer max = n.get(0);
        java.util.Iterator<Integer> listIterator = n.iterator();

        while (listIterator.hasNext()) {
            Integer nextNamber = listIterator.next();
            Integer w = nextNamber.compareTo(max);
            if (w == 1) {
                max = nextNamber;
            }
        }

        System.out.println("Максимальное число = " + max);

    }

    static void mediumNamber(List<Integer> n, Integer size) {
        double medium = 0;
        java.util.Iterator<Integer> listIterator = n.iterator();

        while (listIterator.hasNext()) {
            Integer nextNamber = listIterator.next();
            medium += nextNamber;

        }
        medium = medium / Double.valueOf(size);
            
        System.out.println("Среднеарефмитическое число = " + medium);
    }

}
