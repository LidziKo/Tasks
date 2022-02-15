package Syntax.Task06;

/*Дан двумерный массив chars. Тебе нужно в методе main заменить все внутренние элементы на дефис (минус).*/

public class Solution0633 {
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'j', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}};

    public static void main(String[] args) {
        printArray();

        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[0].length; j++) {
                if ((i != 0) && (i != chars.length - 1)) {
                    if ((j > 0) && (j < (chars[0].length - 1))) {
                        chars[i][j] = '-';
                    }
                }
            }
        }

        printArray();
    }

    private static void printArray() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
