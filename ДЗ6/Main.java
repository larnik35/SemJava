package ДЗ6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//Создать множество ноутбуков.
//Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
//1 - ОЗУ
//2 - Объем ЖД
//3 - Операционная система
//4 - Цвет …
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

public class Main {

  public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        
        set.add(new Notebook("Notebook 1", 8, "Windows10", 512, "grey"));
        set.add(new Notebook("Notebook 2", 16, "Windows10", 256, "black"));
        set.add(new Notebook("Notebook 3", 32, "linux", 1000, "wait"));
        set.add(new Notebook("Notebook 4", 64, "linux", 128, "blue"));

        Operation operation = new Operation(set);
        operation.start();

    }
}