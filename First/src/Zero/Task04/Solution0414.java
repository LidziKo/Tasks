package Zero.Task04;
import java.util.Scanner;

/*Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
        Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
        Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.*/

public class Solution0414 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = scanner.nextInt();

        do {
            System.out.println(s);
            if ((count <= 0) || (count >= 5)) {
                break;
            }
            count--;
        }
        while (count > 0);
    }
}
