package ДЗ4;
//Реализуйте очередь с помощью LinkedList со следующими методами:
//• enqueue() — помещает элемент в конец очереди,
//• dequeue() — возвращает первый элемент из очереди и удаляет его,
//• first() — возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;
import java.util.ListIterator;

public class MyList {
    LinkedList<Integer> myList =  new LinkedList<>();
    
    void enqueue(int val) {
        myList.add(val);
    }

    int dequeue() {
        return myList.removeFirst();
    }
     
    int first(){
         return myList.getFirst();

    }

    public ListIterator<Integer> listiterator() {
        return null;
    }
    





}
