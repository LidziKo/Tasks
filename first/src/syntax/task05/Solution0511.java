package syntax.task05;

import java.util.Scanner;

/* Pеализуй метод main(String[]), который:

        Считывает из консоли число N — количество строк массива (считай, что это число будет больше 0, можно не проверять).
        Считывает N чисел из консоли (любые числа, которые будут больше 0, можно не проверять).
        Инициализирует двумерный массив multiArray:
        количеством строк N;
        строки — массивами, размер которых соответствует числам, введенным в п.2 (в порядке ввода).*/

public class Solution0511 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int strCount = scanner.nextInt();
        multiArray = new int[strCount][];

        for (int i = 0; i < multiArray.length; i++) {
            int n = scanner.nextInt();
            multiArray[i] = new int[n];
        }
    }
}
