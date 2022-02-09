package Syntax.Task04;
import java.util.Scanner;

/*Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
        Слово "enough" выводить не нужно.
        Для этого необходимо использовать бесконечный цикл (while(true)).*/

public class Solution0405 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String data = scanner.nextLine();
            if (data.equalsIgnoreCase("enough")) {
                break;
            }
            else {
                System.out.println(data);
            }
        }
    }
}
