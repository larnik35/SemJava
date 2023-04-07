package ДЗ4;

import java.util.ListIterator;

//еализуйте очередь с помощью LinkedList со следующими методами:
//• enqueue() — помещает элемент в конец очереди,
//• dequeue() — возвращает первый элемент из очереди и удаляет его,
//• first() — возвращает первый элемент из очереди, не удаляя.
public class Task_3_2 {
    public static void main(String[] args) {

        MyList list = new MyList();
        list.enqueue(2);
        list.enqueue(23);
        list.enqueue(24);
        list.enqueue(20);
                    
        


        

        Integer a = list.first();  // Проверка на вывод без удаления
        System.out.println("Первый элемент в list " + a);
        a = list.first();
        System.out.println("Первый элемент в list " + a);
        


        a = list.dequeue(); // Проверка на вывод с удалением 
        System.out.println("Первый элемент в list " + a);
        a = list.dequeue();
        System.out.println("Первый элемент в list " + a);


        a = list.dequeue(); // Проверка на вывод с удалением 
        System.out.println("Первый элемент в list " + a);
        a = list.dequeue();
        System.out.println("Первый элемент в list " + a);
        // ВЫвел с удалением 4 элемента листа ейчас лист пуст





    }



    
}
