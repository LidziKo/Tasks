package syntax.task06;

import java.util.Scanner;

public class Solution0632 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        array = new char[size][(size * 2) - 1];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((j < (array.length - 1 - i) || (j > array[0].length - array.length + i))) {
                    array[i][j] = ' ';
                } else {
                    array[i][j] = '#';
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

    }
}
