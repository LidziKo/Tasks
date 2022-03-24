package syntax.task13;

import java.util.TreeMap;

/* 
Сломанная база данных
*/

public class Solution1329 {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(5533, "Head First Java");
        map.put(5536, "Java. Руководство для начинающих");
        map.put(5535, "Java для чайников");
        map.put(5540, "Java. Полное руководство");
        map.put(5531, "Java. Библиотека профессионала");
        map.put(5538, "Java. Методы программирования");
        map.put(5532, "Java. Справочник разработчика");
        map.put(5539, "Java SE 9. Базовый курс");
        map.put(5537, "Effective Java");
        map.put(5534, "Философия Java");

        for (int i = getMinId(map); i <= getMaxId(map); i++) {
            System.out.printf("%d %s %n", i, map.get(i));
        }
    }

    public static Integer getMinId(TreeMap<Integer, String> map) {
        return map.firstKey();
    }

    public static Integer getMaxId(TreeMap<Integer, String> map) {
        return map.lastKey();
    }
}