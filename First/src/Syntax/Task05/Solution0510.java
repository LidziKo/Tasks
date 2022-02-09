package Syntax.Task05;
import java.util.Arrays;

/*Создай треугольный массив, где значение каждого элемента — это сумма его индексов*/

public class Solution0510 {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1]; // создание для строки i массива из i+1 элементов
            for (int j = 0; j < result[i].length; j++) { // result[i].length тут - количество элементов в массиве
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
