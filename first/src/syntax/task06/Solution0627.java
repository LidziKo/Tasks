package syntax.task06;

/*В классе Solution дан двумерный массив целых чисел (поле array) размерностью 3х3. Необходимо:

        построчно заполнить этот массив числами с клавиатуры;
        перевернуть массив относительно главной диагонали (у главной диагонали есть свойство i == j);
        вывести перевернутый массив на экран в таком виде, как в примере — каждую строку отдельно, элементы в строке через пробел.*/

import java.util.Scanner;

public class Solution0627 {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array[0].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
