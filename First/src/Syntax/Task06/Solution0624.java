package Syntax.Task06;

import java.util.Arrays;
import java.util.Scanner;

/*
В классе Solution дан двумерный массив целых чисел (поле array) размерностью 3х3.
        В методе main нужно заполнить построчно этот массив данными с клавиатуры и вывести на экран максимальный элемент массива.
*/

public class Solution0624 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = scanner.nextInt();
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }
}


