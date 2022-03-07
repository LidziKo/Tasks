package syntax.task03;
import java.util.Scanner;

/*Программа должна считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
        Выведи на экран максимальное четное число из введенных. Если введено несколько таких чисел, необходимо вывести любое из них.*/

public class Solution0302 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (scanner.hasNextInt()) {
            int inputInt = scanner.nextInt();
            if ((inputInt % 2 == 0) && (inputInt > max)) {
                max = inputInt;
            }
        }
        System.out.println(max);
    }
}
