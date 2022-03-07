package syntax.task07;

/*Иногда необходимо заполнить какую-то часть массива одинаковыми значениями или же удалить существующие (присвоить значение null).
        Реализуй для этого более гибкий метод fillArray(Integer[] array, int value, int begin, int end),*/

import java.util.Arrays;

public class Solution0711 {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        for (int i = begin; i < end; i++) {
            array[i] = value;
        }
    }
}
