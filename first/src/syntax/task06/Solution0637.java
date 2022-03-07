package syntax.task06;

/*В программе дан двумерный массив размером 5*6.
        Используя только метод fill класса Arrays, заполни массив символами 'X' (большая латинская буква икс) и ' ' (пробел) так,
        как показано в примере. Для решения этой задачи нельзя использовать циклы.*/

import java.io.IOException;
import java.util.Arrays;

public class Solution0637 {
    public static char[][] array = new char[5][6];

    public static void main(String[] args) throws IOException {
        Arrays.fill(array[0], 'X');
        Arrays.fill(array[1], 'X');
        Arrays.fill(array[1], 1, 5, ' ');
        Arrays.fill(array[2], 'X');
        Arrays.fill(array[2], 1, 5, ' ');
        Arrays.fill(array[3], 'X');
        Arrays.fill(array[3], 1, 5, ' ');
        Arrays.fill(array[4], 'X');

    }
}
