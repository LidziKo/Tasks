package Syntax.Task06;

import java.util.Arrays;
import java.util.Scanner;

/*В классе Solution дан двумерный массив целых чисел (поле array) размерностью 3х3.
        В методе main нужно заполнить построчно этот массив данными с клавиатуры,
        посчитать сумму элементов в каждом столбце и в каждой строке и вывести наименьшую из этих сумм на экран.*/

public class Solution0625 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strSum;
        int columnSum;
        int totalStrSum = Integer.MAX_VALUE;
        int totalColumnSum = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            strSum = 0;
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = scanner.nextInt();
                strSum += array[i][j];
            }
            if (strSum < totalStrSum) {
                totalStrSum = strSum;
            }
        }

        for (int i = 0; i < array.length; i++) {
            columnSum = 0;
            for (int j = 0; j < array[0].length; j++) {
                columnSum += array[j][i];
            }
            if (columnSum < totalColumnSum) {
                totalColumnSum = columnSum;
            }
        }
        System.out.println(Math.min(totalStrSum, totalColumnSum));
    }
}