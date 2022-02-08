package Zero.Task05;

/*Reverse
        Тебе нужно написать программу, которая:

        Считывает с консоли целое число N.
        Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
        Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
        Каждое число выводить с новой строки. Число N выводить не нужно.*/

import java.util.Scanner;

public class Solution0505 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] array = new int[number];

        if (number > 0) {
            for (int i = 0; i < number; i++) {
                array[i] = scanner.nextInt();
            }
        }

        if (number % 2 != 0) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
        else {
            for (int i = (array.length - 1); i >= 0; i--) {
                System.out.println(array[i]);
            }
        }
    }
}
