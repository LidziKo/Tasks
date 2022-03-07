package syntax.task06;

/*Давай создадим программу для генерации квадратных шахматных досок с заданной размерностью.
        В классе Solution дан двумерный массив символов (поле array). Необходимо:

        считать число с клавиатуры — это и будет размерность нашей будущей доски (длина стороны);
        инициализировать массив array соответствующим значением;
        "закрасить" массив так, чтобы получилась шахматная доска (черные клетки — '#', белые — '').
        Начинаем заполнять массив с '#' с верхнего левого угла;
        вывести массив на экран в таком виде, как в примере (каждую строку отдельно).*/

import java.util.Scanner;

public class Solution0634 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        array = new char[size][size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((i % 2 == 0)) {
                    if ((j % 2 == 0)) {
                        array[i][j] = '#';
                    } else {
                        array[i][j] = ' ';
                    }
                } else {
                    if ((j % 2 == 0)) {
                        array[i][j] = ' ';
                    } else {
                        array[i][j] = '#';
                    }
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
