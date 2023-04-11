//Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина,
//Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова,
//Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
//Отсортировать по убыванию популярности. 
//Для сортировки использовать TreeMap.

package ДЗ5;



import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;


import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Task_5_2 {
    

    public static void main(String[] args) {
        sortTreeMap(
                "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов ");

    }

    static void sortTreeMap(String s) {
        s = s.replace(",", "");
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> map_2 = new HashMap<>();
        Map<Integer, String> map_3 = new TreeMap<>(Comparator.reverseOrder());
       
        
        
        String[] arr = s.split(" ");
        

        String[] arr_2 = new String[arr.length / 2]; // убрал фамилии 
        Integer i = 0;
        for (int index = 0; index < arr.length; index = index + 2) {
            String n = arr[index];
            arr_2[i] = n;
            i++;
            System.out.print(n + ", ");
        }
        

        for (int j = 0; j < arr_2.length; j++) { // Собрал в MAP где ключ это имя а значение сколько раз повторяется
            Integer cont = 0;
            for (var e : arr_2) {
                if (e.equals(arr_2[j])) {
                    cont++;
                }
            }
            map.put(arr_2[j], cont);
        }
        System.out.println(map);
        
        Set set = map.entrySet();
        Iterator listMapIterator = set.iterator();

        while (listMapIterator.hasNext()) { // Перевернул сделал ключем колличество повторений а значением повторяющеяся имена 
            Map.Entry<String, Integer> me = (Entry<String, Integer>) listMapIterator.next();
            String vol = me.getKey();
            String vol_1 = vol;
            Integer key = me.getValue();
            if (map_2.containsKey(key)) {
                vol_1 = map_2.get(key);
                vol_1 = vol_1 + ", " + vol;
                map_2.put(key, vol_1);
            } else {
            map_2.put(key, vol);}
        }
        System.out.println(map_2);
        map_3.putAll(map_2);
        System.out.println("\nСортируем по убыванию популярности имен \n");
        System.out.println(map_3);

       
           
           
    }

}
