package Syntax.Task06;
import java.util.Arrays;
import java.util.Scanner;

/*В классе Solution проинициализируй поле array значением двумерного массива целых чисел размерностью 2х3.
        В методе main заполни этот массив целыми числами (кроме 0) и выведи на экран.*/

public class Solution0623 {
    private static int[][] array;

    public static void main(String[] args) {
        array = new int[2][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = i + j + 1;
            }
        }
        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
