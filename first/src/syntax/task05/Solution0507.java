package syntax.task05;

/*Максимальное из N чисел
        В этой задаче тебе нужно:

        Ввести с клавиатуры число N.
        Считать N целых чисел и заполнить ими массив array.
        Найти максимальное число среди элементов массива.*/

import java.util.Scanner;

public class Solution0507 {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}

