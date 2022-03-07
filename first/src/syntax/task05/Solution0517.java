package syntax.task05;

/*Реализуй метод main(String[]), который делит массив array на два подмассива и заполняет ими двумерный массив result.
        Если длина массива нечетная, то большую часть нужно скопировать в первый подмассив.
        Для разделения массива используй метод Arrays.copyOfRange(int[], int, int). Порядок элементов не меняй.*/

import java.util.Arrays;

public class Solution0517 {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        int x = (array.length % 2 != 0) ? array.length / 2 + 1 : array.length / 2;
        result[0] = Arrays.copyOfRange(array, 0, x);
        result[1] = Arrays.copyOfRange(array, x, array.length);
        System.out.println(Arrays.deepToString(result));
    }
}
