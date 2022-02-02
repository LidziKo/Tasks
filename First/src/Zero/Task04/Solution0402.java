package Zero.Task04;

/*Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
        Каждый вывод - с новой строки.*/

import java.util.Scanner;

public class Solution0402 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = " любит меня.";
        String result = scanner.nextLine() + text;
        int i = 1;

        while (i <= 10) {
            System.out.println(result);
            i++;
        }
    }
}
