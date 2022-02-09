package Syntax.Task04;
import java.util.Scanner;

/*
В этой задаче нужно:

        Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
        Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно, а программа может быть завершена с ошибкой.
        Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры. Если таких чисел несколько, то необходимо вывести любое из них.
        Минимальных чисел тоже может быть несколько.
*/

public class Solution0407 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInt = scanner.nextInt();
        int nextInt = scanner.nextInt();
        if (firstInt > nextInt) {
            int swap;
            swap = firstInt;
            firstInt = nextInt;
            nextInt = swap;
        }
        while (true) {
            if (scanner.hasNextInt()) {
                int x = scanner.nextInt();

                if (firstInt == nextInt) {
                    if (x > firstInt) {
                        nextInt = x;
                    }
                    if (x < firstInt) {
                        firstInt = x;
                    }
                }
                if ((x > firstInt) && (x < nextInt)) {
                    nextInt = x;
                }
                if (x < firstInt) {
                    nextInt = firstInt;
                    firstInt = x;
                }
            }
            else {
                System.out.println(nextInt);
                break;
            }
        }
    }
}
