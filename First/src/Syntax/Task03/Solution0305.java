package Syntax.Task03;
import java.util.Scanner;

/*
В методе main с клавиатуры считывается 3 целых числа: start, end (start <= end), multiple.
        Допиши программу, чтобы на экран выводилась сумма чисел от start (включительно) до end (не включительно), кратных multiple.
        чтобы перейти к следующей итерации цикла, используй оператор continue.
*/


public class Solution0305 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();
        int sum = 0;

        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
